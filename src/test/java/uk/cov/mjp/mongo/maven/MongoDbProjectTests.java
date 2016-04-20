package uk.cov.mjp.mongo.maven;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uk.cov.mjp.mongo.maven.repo.Project;
import uk.cov.mjp.mongo.maven.repo.ProjectRepository;

/**
 * You must install and start mongo before running this test.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringMongoConfiguration.class)
public class MongoDbProjectTests {

	@Autowired
	private ProjectRepository projectRepository;

	@Before
	public void init() {
		projectRepository.deleteAll();
		Project project = new Project("sdfjklgh", 1, "comunione Leonardo", 5, 6);
		projectRepository.save(project);
	}

	@Test
	public void test1() {
		List<Project> list = projectRepository.findAll();
		Assert.assertEquals(1, list.size());
	}

}
