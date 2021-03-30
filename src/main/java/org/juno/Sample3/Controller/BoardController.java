package org.juno.Sample3.Controller;

import java.util.List;

import org.juno.Sample3.Domain.BoardVO;
import org.juno.Sample3.Service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	@RequestMapping(path = "list")
	public String list(Model model) {

		List<BoardVO> list = service.list();
		model.addAttribute("boardList", list);

		return "/board/list";
	}
	
	@GetMapping(path="read")
	public String read(Model model, int boardNo) {
		
		BoardVO vo = service.read(boardNo);
		model.addAttribute("vo", vo);
		
		return "/board/read";
	}
	
	@RequestMapping(path = "search")
	public String search(Model model, BoardVO vo) {
		
		List<BoardVO> list = service.search(vo);
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
	public String update(RedirectAttributes redirect, BoardVO vo) {
		
		service.update(vo);
		redirect.addAttribute("boardNo", vo.getBoardNo());
		
		return "redirect:/board/read";
	}
	
//	delete
	@GetMapping(path = "delete")
	public String delete(int boardNo) {
		
		service.delete(boardNo);
		
		return "redirect:/board/list";
	}

}














