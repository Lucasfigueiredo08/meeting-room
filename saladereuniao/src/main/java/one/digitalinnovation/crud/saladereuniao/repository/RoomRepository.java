package one.digitalinnovation.crud.saladereuniao.repository;


import one.digitalinnovation.crud.saladereuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
