package com.ogong.service.board;


import java.util.List;
import java.util.Map;

import com.ogong.service.domain.Answer;
import com.ogong.service.domain.Board;
import com.ogong.service.domain.Comment;

public interface BoardService {

		//게시글 등록
		public void addBoard(Board board) throws Exception;
		
		//게시글 조회
		public Map<String, Object> getBoard(Board board) throws Exception;
		
		//게시글 수정
		public void updateBoard(Board board) throws Exception;
		
		//게시글 삭제
		public void deleteBoard(Board board) throws Exception; 
		
		//게시글 목록
		public List<Board> listBoard(Map<String, Object> map) throws Exception;
		
		//댓글 등록
		public void addComment(Comment comment) throws Exception;
		
		//댓글 수정
		public void updateComment(Comment comment) throws Exception;
		
		//댓글 삭제
		public void deleteComment(int commentNo) throws Exception;
		
		//댓글 목록
		public Map<String, Object> listComment(int boardNo) throws Exception;
		
		//Q&A 답변 등록
		public void addAnswer(Answer answer) throws Exception;
		
		//Q&A 답변 수정
		public void updateAnswer(Answer answer) throws Exception;
		
		//Q&A 답변 삭제
		public void deleteAnswer(int answerNo) throws Exception;
}
