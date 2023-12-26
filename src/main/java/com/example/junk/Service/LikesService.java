package com.example.junk.Service;

import com.example.junk.domain.Likes;
import com.example.junk.domain.PhotoGallery;
import com.example.junk.domain.User;
import com.example.junk.repository.LikesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LikesService {

    private final LikesRepository likesRepository;

    public Likes checkLikes(User user, PhotoGallery photoGallery) {

        Optional<Likes> checkLikes = likesRepository.findByUserAndPhotoGallery(user, photoGallery);
        if(checkLikes.isEmpty()) {
            return null;
        }
        return checkLikes.get();
    }


}
