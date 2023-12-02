package zerobase.weather_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zerobase.weather_project.domain.Memo;

@Repository
public interface JpaMemoRepository extends JpaRepository<Memo, Integer> {

}
