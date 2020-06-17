/*               "Copyright 2020 Infosys Ltd.
               Use of this source code is governed by GPL v3 license that can be found in the LICENSE file or at https://opensource.org/licenses/GPL-3.0
               This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License version 3"*/
/**
 * © 2017 - 2019 Infosys Limited, Bangalore, India. All Rights Reserved.
 * Version: 1.10
 * <p>
 * Except for any free or open source software components embedded in this Infosys proprietary software program (“Program”),
 * this Program is protected by copyright laws, international treaties and other pending or existing intellectual property rights in India,
 * the United States and other countries. Except as expressly permitted, any unauthorized reproduction, storage, transmission in any form or
 * by any means (including without limitation electronic, mechanical, printing, photocopying, recording or otherwise), or any distribution of
 * this Program, or any portion of it, may result in severe civil and criminal penalties, and will be prosecuted to the maximum extent possible
 * under the law.
 * <p>
 * Highly Confidential
 */

package com.infosys.lexauthoringservices.repository.cassandra.bodhi;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import com.infosys.lexauthoringservices.model.cassandra.OrdinalsModel;
import com.infosys.lexauthoringservices.model.cassandra.OrdinalsPrimaryKeyModel;

@Repository
public interface OrdinalsRepository extends CassandraRepository<OrdinalsModel,OrdinalsPrimaryKeyModel> {
	

	@Query("SELECT * from master_values_v2 where root_org= ?0;")
	public List<OrdinalsModel> findByRootOrg(String rootOrg);
	
	@Query("SELECT * from master_values_v2 where root_org= ?0 and entity= ?1;")
	public OrdinalsModel findByRootOrgEntity(String rootOrg,String entity);
}