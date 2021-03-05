package com.axebeak.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import com.axebeak.model.Artist;
import com.axebeak.services.ArtistService;

@Controller
public class ArtistController {

	@Autowired
	private ArtistService artistService;
	
	@RequestMapping(value = "/artist-list", method=RequestMethod.GET)
	public String getArtistList(ModelMap model) throws Exception {
		Iterable<Artist> arts = artistService.findAll();
		model.put("artists", arts);
		return "artist-list";
	}
	
	@RequestMapping(value="/delete-artist/{id}")
	public ModelAndView deleteArtist(ModelMap model, @PathVariable("id") Integer id) {
		Artist a = artistService.getArtistById(id);
		artistService.deleteArtist(a);
		model.put("deleted", a.getArtist_name());
		return new ModelAndView("redirect:/artist-list", model); 
	}
	
	//add artist page interaction
	@GetMapping("/add-artist")
    public String newArtistForm(ModelMap model) {
        return "add-artist";
    }

    @PostMapping("/add-artist")
    public RedirectView createNewArtist(ModelMap model, Principal principal, Artist art) {
        artistService.addArtist(art);
        return new RedirectView("artist-list");
    }
    
    //edit artist page interaction
    @GetMapping("/edit-artist/{id}")
    public String updateTaskForm(ModelMap model, @PathVariable("id") Integer id) {
        Artist art = artistService.getArtistById(id);
        model.put("artist", art);
        return "edit-artist";
    }

    @PostMapping("/edit-artist/{id}")
    public RedirectView updateTask(Principal principal, Artist art, @PathVariable("id") Integer id) {
    	artistService.updateArtist(art);
        return new RedirectView("/artist-list");
    }
}
