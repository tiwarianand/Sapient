package com.test.show.service;

import java.util.List;

import com.test.show.entity.Show;


public interface ShowService {
	// Save operation
	Show saveShow(Show show);
  
    // Read operation
    List<Show> fetchShowList();
  
    // Update operation
    Show updateShow(Show show,Long showId);
  
    // Delete operation
    void deleteShowById(Long showId);
}
