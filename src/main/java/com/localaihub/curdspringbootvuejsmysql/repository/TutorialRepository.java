package com.localaihub.curdspringbootvuejsmysql.repository;

import com.localaihub.curdspringbootvuejsmysql.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Jiaxing Jiang
 * @version 0.1.0-SNAPSHOT
 * @date 2024/1/10 00:23
 */
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(String title);
}
