package org.juno.Sample3.Controller;

import java.util.List;

import org.juno.Sample3.Domain.BoardVO;
import org.juno.Sample3.Service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
@RequestMapping(path = "/board")
@Controller
public class BoardController {

	private BoardService service;

//	insert
	@GetMapping(path = "insert")
	public String insert() {
			
		return "/board/insert";
	}

	@PostMapping(path = "insert")
	public String insert(BoardVO vo) {

		service.insert(vo);
		
		return "redirect:/board/list";
	}

//	select
	@GetMapping(path = "list")
	public String list(Model model) {

		List<BoardVO> list = service.list();
		model.addAttribute("boardList", list);

		return "/board/list";
	}
	
//	update
	@GetMapping(path = "update")
	public String update(Model model, int boardNo) {
		
		model.addAttribute("boardNo", boardNo);
		
		return "/board/update";
	}
	
	@PostMapping(path = "update")
	public String update(BoardVO vo) {
		
		log.info(vo);
		service.update(vo);
		
		return "redirect:/board/list";
	}
	
	

}









