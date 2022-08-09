package uz.mxz.tnvet.tnved2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.mxz.tnvet.tnved2.entity.Tnved;

@Repository
public interface TnvedRepository extends JpaRepository<Tnved, String> {
}
