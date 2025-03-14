package com.dynamodb.repo;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.dynamodb.entities.User;

@EnableScan
public interface DynamoDBRepo extends CrudRepository<User, String> {
}
