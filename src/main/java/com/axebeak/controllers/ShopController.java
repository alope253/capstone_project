package com.axebeak.controllers;


//add the song/album you want, add it to your cart

import com.axebeak.model.Song;
import com.axebeak.services.CartService;
import com.axebeak.services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShopController {

    @Autowired
    CartService cartService;

    @Autowired
    SongService songService;

    @RequestMapping(value = "/shop-page", method = RequestMethod.POST)
    public String addSong(ModelMap model, @RequestParam Song song, @RequestParam int cart_id){
        cartService.addSongToCart(cart_id, song);
        model.put("return-message", song );
        return"shop-page";
    }

    @RequestMapping(value = "/shop-page", method = RequestMethod.GET)
    public String showAddedSong(ModelMap model){
        model.put( "songs",songService.songsToString());
        model.put("listSong", songService.getAllSongs());

        return "shop-page";
    }


}
