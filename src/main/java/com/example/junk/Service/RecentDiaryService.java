package com.example.junk.Service;

import com.example.junk.domain.User;
import com.example.junk.entity.Diary;
import com.example.junk.repository.DiaryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RecentDiaryService {
    private final DiaryRepository diaryRepository;

    public RecentDiaryService(DiaryRepository diaryRepository) {
        this.diaryRepository = diaryRepository;
    }
    public Page<Diary> getRecentDiariesByUser(User user, Pageable pageable) {
        return diaryRepository.findRecentDiariesByUser(user, pageable);
    }

}
