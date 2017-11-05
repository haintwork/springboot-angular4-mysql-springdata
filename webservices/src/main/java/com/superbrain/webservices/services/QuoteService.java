/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superbrain.webservices.services;

import com.superbrain.webservices.models.Quote;
import com.superbrain.webservices.repositories.QuoteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author haing
 */
@Service
public class QuoteService {

    @Autowired
    private QuoteRepository quoteRepository;

    @Transactional
    public List<Quote> getAll() {
        List<Quote> allQuotes = quoteRepository.findAll();
        return allQuotes;
    }

    @Transactional
    public Quote get(Integer id) {
        final Quote quote = quoteRepository.findOne(id);
        return quote;
    }
}
