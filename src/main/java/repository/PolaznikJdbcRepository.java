package repository;

import domain.Polaznik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PolaznikJdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Polaznik> findAll() {
        String sql = "SELECT * FROM polaznik";

        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Polaznik p = new Polaznik();
            p.setPolaznikID(rs.getLong("polaznikID"));
            p.setIme(rs.getString("ime"));
            p.setPrezime(rs.getString("prezime"));
            return p;
        });
    }

    public Polaznik findById(Long id) {
        String sql = "SELECT * FROM polaznik WHERE polaznikID = ?";

        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) -> {
            Polaznik p = new Polaznik();
            p.setPolaznikID(rs.getLong("polaznikID"));
            p.setIme(rs.getString("ime"));
            p.setPrezime(rs.getString("prezime"));
            return p;
        });
    }

    public int save(Polaznik p) {
        String sql = "INSERT INTO polaznik (ime, prezime) VALUES (?, ?)";
        return jdbcTemplate.update(sql, p.getIme(), p.getPrezime());
    }

    public int delete(Long id) {
        String sql = "DELETE FROM polaznik WHERE polaznikID = ?";
        return jdbcTemplate.update(sql, id);
    }
}
