package r6.siege.service;

import org.springframework.stereotype.Service;
import r6.siege.model.Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class MapsService {

    public Collection<Map> getAllMaps() {
        List<Map> maps = new ArrayList<>();
        maps.add(new Map("Coastline"));
        maps.add(new Map("Border"));
        return maps;
    }
}
