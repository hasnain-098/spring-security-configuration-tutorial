package dev.hasnain.mssc.repository;

import dev.hasnain.mssc.model.Post;
import org.springframework.data.repository.ListCrudRepository;

public interface PostRepository extends ListCrudRepository<Post, Integer> {
}
