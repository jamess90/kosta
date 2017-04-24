package com.rnb.spring_board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.rnb.spring_board.dao.BDao;
import com.rnb.spring_board.dto.BDto;

public class BContentCommand implements Bcommand{

	@Override
	public void execute(Model model) {

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String bId = request.getParameter("bId");
		
//		BDao dao = new BDao();
//		BDto dto = dao.contentView(bId);
		
//		model.addAttribute("content_view", dto);
		
		
		
	}

}