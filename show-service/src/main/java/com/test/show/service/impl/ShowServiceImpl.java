package com.test.show.service.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.show.entity.Show;
import com.test.show.repository.ShowRepository;
import com.test.show.service.ShowService;


public class ShowServiceImpl implements ShowService{

	@Autowired
	private ShowRepository showRepository;

	// Save operation
	@Override
	public Show saveShow(Show show)
	{
	    return showRepository.save(show);
	}

	// Read operation
	@Override public List<Show> fetchShowList()
	{
	    return (List<Show>)showRepository.findAll();
	}

	// Update operation
	@Override
	public Show updateShow(Show show, Long showId)
	{
		Show showDb = showRepository.findById(showId).get();
	
	    showDb.setMovieId(show.getMovieId());
	    showDb.setTheaterId(show.getTheaterId());
	    showDb.setShowTime(show.getShowTime());
	    
	    return showRepository.save(showDb);
	}

	// Delete operation
	@Override
	public void deleteShowById(Long showId)
	{
		showRepository.deleteById(showId);
	}

}
