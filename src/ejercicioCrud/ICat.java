package ejercicioCrud;

import java.io.IOException;
import java.util.List;

public interface ICat {
    CatDTO findById(int id);
    List<CatDTO> findAll() throws IOException, ClassNotFoundException;
    void save(CatDTO cat) throws IOException;
    void update(CatDTO cat) throws IOException;
    void delete(CatDTO cat) throws IOException;
}
