package com.concretepage.web.service;
import java.util.List;

import com.concretepage.web.entity.Article;


public interface IArticleService {
     boolean addArticle(Article article);
     void updateArticle(Article article);
     void deleteArticle(Article article);
     List<Article> getAllArticles();
     Article getArticleById(long articleId);
}
