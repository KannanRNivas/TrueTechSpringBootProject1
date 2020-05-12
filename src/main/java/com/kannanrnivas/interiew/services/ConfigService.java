package com.kannanrnivas.interiew.services;

import com.kannanrnivas.interiew.models.ConfigModel;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Class for config service
 *
 * @author KannanRNivas
 */
@Service
public class ConfigService {

    /**
     * Gets all the config models
     *
     * @return all the config models
     */
    public List<ConfigModel> findAll() {

        List<ConfigModel> list = new LinkedList<>();
        IntStream.range(1, 10).forEach(
                id -> {
                    list.add(new ConfigModel(id, "Config " + id));
                }
        );

        return list;
    }
}
