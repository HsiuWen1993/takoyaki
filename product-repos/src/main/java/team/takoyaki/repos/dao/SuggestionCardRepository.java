package team.takoyaki.repos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import team.takoyaki.repos.po.SuggestionCardEntity;

public interface SuggestionCardRepository extends JpaRepository<SuggestionCardEntity, Long> {

}
