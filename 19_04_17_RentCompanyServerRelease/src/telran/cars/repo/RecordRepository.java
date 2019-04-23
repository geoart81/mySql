package telran.cars.repo;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import telran.cars.entities.RecordJpa;

public interface RecordRepository extends
JpaRepository<RecordJpa, Long> {

	RecordJpa findByCarRegNumberAndReturnDateNull(String regNumber);

	List<RecordJpa> findByDriverLicenseId(long licenseId);

	List<RecordJpa> findByCarRegNumber(String regNumber);

	List<RecordJpa> findByRentDateBetween(LocalDate from, LocalDate to);


}
