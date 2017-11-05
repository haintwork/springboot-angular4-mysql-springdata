/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superbrain.webservices;

import com.superbrain.webservices.models.Quote;
import com.superbrain.webservices.services.QuoteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author haing
 */
@RestController
@RequestMapping("quote")
public class QuoteController {
    
    @Autowired
    private QuoteService quoteService;
    
    @GetMapping
    public List<Quote> getAll(){
        List<Quote> allQuotes = quoteService.getAll();
        return allQuotes;
    }
    
    @GetMapping("/{id}")
    public Quote get(@PathVariable(value="id") Integer id){
        final Quote quote = quoteService.get(id);
        return quote;
    }
}
