package com.leavetrail.chat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datastax.astra.sdk.AstraClient;

@RestController
public class AstraController {

    // Provided by the Starter
 @Autowired
 private AstraClient astraClient;

 // Spring Data using the CqlSession initialized by the starter
 @Autowired
 private CassandraTemplate cassandraTemplate;

 @GetMapping("/api/devops/organizationid")
 public String showOrganizationId() {
   return astraClient.apiDevopsOrganizations().organizationId();
 }

 @GetMapping("/api/spring-data/datacenter")
 public String showDatacenterNameWithSpringData() {
   return cassandraTemplate.getCqlOperations()
                           .queryForObject("SELECT data_center FROM system.local", String.class);
 }

 @GetMapping("/api/cql/datacenter")
 public String showCqlDatacenterNameWithSpringData() {
   return astraClient.cqlSession()
                     .execute("SELECT data_center FROM system.local")
                     .one().getString("data_center");
 }
}
