package koo.bon.moo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import koo.bon.moo.dto.MemberDTO;

public class MemberDAO {
	private static MemberDAO memberDAO = new MemberDAO();
	private String CONNECTION_POOL_RESOURCE_NAME = "jdbc/testdb";
	private final String TABLE_NAME = "member";
	private DataSource dataSource;
	
	private final String INSERT_MEMBER_SQL = 
			"INSERT INTO " + TABLE_NAME + " (name, id, nickname, pw, email, postcode, roadAddress, jibunAddress, detailAddress, extraAddress, birthYear, birthMonth, birthDate, cellphone, gender) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private final String UPDATE_MEMBER_SQL = 
			"UPDATE " + TABLE_NAME + " SET nickname=?, pw=?, email=?, postcode=?, roadAddress=?, jibunAddress=?, detailAddress=?, extraAddress=?, birthYear=?, birthMonth=?, birthDate=?, cellphone=?, gender=? WHERE ID = ?";
	private final String LOGIN_MEMBER_SQL = 
			"SELECT * FROM member WHERE id = ? AND pw = ?";
	
	
	private MemberDAO() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/" + CONNECTION_POOL_RESOURCE_NAME);
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public static MemberDAO getMemberDAO() {
		return memberDAO;
	}
	
	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void memberRegisterDAO(MemberDTO dto) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt = conn.prepareStatement(INSERT_MEMBER_SQL);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getId());
			pstmt.setString(3, dto.getNickname());
			pstmt.setString(4, dto.getPw());
			pstmt.setString(5, dto.getEmail());
			pstmt.setString(6, dto.getPostcode());
			pstmt.setString(7, dto.getRoadAddress());
			pstmt.setString(8, dto.getJibunAddress());
			pstmt.setString(9, dto.getDetailAddress());
			pstmt.setString(10, dto.getExtraAddress());
			pstmt.setInt(11, dto.getBirthYear());
			pstmt.setInt(12, dto.getBirthMonth());
			pstmt.setInt(13, dto.getBirthDate());
			pstmt.setString(14, dto.getCellphone());
			pstmt.setString(15, dto.getGender());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt, conn);
		}		
	}
	
	public void memberModifyDAO(MemberDTO dto) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt = conn.prepareStatement(UPDATE_MEMBER_SQL);
			pstmt.setString(1, dto.getNickname());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getEmail());
			pstmt.setString(4, dto.getPostcode());
			pstmt.setString(5, dto.getRoadAddress());
			pstmt.setString(6, dto.getJibunAddress());
			pstmt.setString(7, dto.getDetailAddress());
			pstmt.setString(8, dto.getExtraAddress());
			pstmt.setInt(9, dto.getBirthYear());
			pstmt.setInt(10, dto.getBirthMonth());
			pstmt.setInt(11, dto.getBirthDate());
			pstmt.setString(12, dto.getCellphone());
			pstmt.setString(13, dto.getGender());
			pstmt.setString(14, dto.getId());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt, conn);
		}	
	}
	
	public MemberDTO memberLoginDAO(MemberDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		conn = getConnection();
		try {
			pstmt = conn.prepareStatement(LOGIN_MEMBER_SQL);
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto.setName(rs.getString("name"));
				dto.setId(rs.getString("id"));
				dto.setNickname(rs.getString("nickname"));
				dto.setPw(rs.getString("pw"));
				dto.setEmail(rs.getString("email"));
				dto.setPostcode(rs.getString("postcode"));
				dto.setRoadAddress(rs.getString("roadAddress"));
				dto.setJibunAddress(rs.getString("jibunAddress"));
				dto.setDetailAddress(rs.getString("detailAddress"));
				dto.setExtraAddress(rs.getString("extraAddress"));
				dto.setBirthYear(rs.getInt("birthYear"));
				dto.setBirthMonth(rs.getInt("birthMonth"));
				dto.setBirthDate(rs.getInt("birthDate"));
				dto.setCellphone(rs.getString("Cellphone"));
				dto.setGender(rs.getString("gender"));
			} else {
				dto = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs, pstmt, conn);
		}
		return dto;
	}
	public void close(ResultSet rs, PreparedStatement pstmt, Connection conn){
		
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void close(PreparedStatement pstmt, Connection conn){
		
		try {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
}