package uk.cov.mjp.mongo.maven.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, String> {

	public Project findByName(String name);

}
