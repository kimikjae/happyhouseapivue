package com.ssafy.happyhouse.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.happyhouse.dto.QnA;

@Mapper
public interface QnADAO {
	public List<QnA>selectQnA();
	public QnA selectQnAByNo(int no);
	public int insertQnA(QnA qna);
	public int updateQnA(QnA qna);
	public int deleteQnA(int no);
}
