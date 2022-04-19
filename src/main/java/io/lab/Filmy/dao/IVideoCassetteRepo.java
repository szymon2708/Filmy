package io.lab.Filmy.dao;

import io.lab.Filmy.dao.entity.VideoCassette;
import org.springframework.data.repository.CrudRepository;

public interface IVideoCassetteRepo extends CrudRepository<VideoCassette, Long> {
}
