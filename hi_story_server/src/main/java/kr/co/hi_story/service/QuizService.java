package kr.co.hi_story.service;


import javax.servlet.http.HttpServletResponse;

import kr.co.hi_story.dto.DataDTO;
import kr.co.hi_story.dto.MemberDTO;
import kr.co.hi_story.dto.MessageDTO;
import kr.co.hi_story.dto.ParticipationDTO;
import kr.co.hi_story.dto.QuizDTO;


public interface QuizService {
<<<<<<< HEAD
	public MessageDTO  createQ(QuizDTO dto);
=======
	public MessageDTO createQ(QuizDTO dto);
>>>>>>> d85a4d7230563738e7b9871980c848b6608ace84
	
	public MessageDTO deleteQ(QuizDTO dto);
	
	public DataDTO successRate(QuizDTO dto);

	public MessageDTO editingQuiz(QuizDTO dto);

	public DataDTO quizQuestion(QuizDTO dto);

	public MessageDTO takeQuiz(ParticipationDTO dto);

	public DataDTO cityList();

	public DataDTO rnameList(String cityname);
	
	
}
