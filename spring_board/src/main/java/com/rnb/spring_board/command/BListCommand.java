package com.rnb.spring_board.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.rnb.spring_board.dao.BDao;
import com.rnb.spring_board.dto.BDto;

public class BListCommand implements Bcommand{

	@Override
	public void execute(Model model) {
		
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		
		model.addAttribute("list",dtos);
		
	}

}
