package com.axebeak.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import com.axebeak.model.Genre;
import com.axebeak.services.GenreService;

@Controller
public class GenreController {

	@Autowired
	private GenreService genreService;
	
	@RequestMapping(value = "/genre-list", method=RequestMethod.GET)
	public String getGenreList(ModelMap model) throws Exception {
		Iterable<Genre> gens = genreService.findAll();
		model.put("genres", gens);
		return "genre-list";
	}
	
	@RequestMapping(value="/delete-genre/{id}")
	public ModelAndView deleteGenre(ModelMap model, @PathVariable("id") Integer id) {
		Genre g = genreService.getGenreById(id);
		genreService.deleteGenre(g);
		model.put("deleted", g.getName());
		return new ModelAndView("redirect:/genre-list", model); 
	}
	
	//add genre page interaction
	@GetMapping("/add-genre")
    public String newGenreForm(ModelMap model) {
        return "add-genre";
    }

    @PostMapping("/add-genre")
    public RedirectView createNewGenre(ModelMap model, Principal principal, Genre gen) {
        genreService.addGenre(gen);
        return new RedirectView("genre-list");
    }
    
    //edit genre page interaction
    @GetMapping("/edit-genre/{id}")
    public String updateTaskForm(ModelMap model, @PathVariable("id") Integer id) {
        Genre gen = genreService.getGenreById(id);
        model.put("genre", gen);
        return "edit-genre";
    }

    @PostMapping("/edit-genre/{id}")
    public RedirectView updateTask(Principal principal, Genre gen, @PathVariable("id") Integer id) {
    	genreService.updateGenre(gen);
        return new RedirectView("/genre-list");
    }
}