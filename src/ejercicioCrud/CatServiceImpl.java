package ejercicioCrud;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CatServiceImpl implements ICat {
    private List<CatDTO> cats;
    public CatServiceImpl() throws IOException, ClassNotFoundException{
        cats  = new ArrayList<>();
    }

    @Override
    public CatDTO findById(int id) {
        return null;
    }

    @Override
    public List<CatDTO> findAll() throws IOException, ClassNotFoundException {
        return null;
    }

    @Override
    public void save(CatDTO cat) throws IOException {

    }

    @Override
    public void update(CatDTO cat) throws IOException {

    }

    @Override
    public void delete(CatDTO cat) throws IOException {

    }
}
