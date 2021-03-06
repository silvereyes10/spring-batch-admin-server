package kr.revelope.spring.batch.admin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import kr.revelope.spring.batch.admin.model.JobInstance;

@Mapper
public interface JobInstanceMapper {
	JobInstance selectJobInstance(@Param("jobInstanceId") long jobInstanceId, @Param("tablePrefix") String tablePrefix);

	void deleteJobInstanceLessThan(@Param("jobInstanceId") long jobInstanceId, @Param("tablePrefix") String tablePrefix);
}
