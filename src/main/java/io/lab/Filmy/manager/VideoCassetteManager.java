package io.lab.Filmy.manager;

import io.lab.Filmy.dao.IVideoCassetteRepo;
import io.lab.Filmy.dao.entity.VideoCassette;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class VideoCassetteManager {
    private IVideoCassetteRepo videoCassetteRepo;

    @Autowired
    public VideoCassetteManager(IVideoCassetteRepo videoCassetteRepo) {
        this.videoCassetteRepo = videoCassetteRepo;
    }

    public Optional<VideoCassette> findById(Long id) {
        return this.videoCassetteRepo.findById(id);
    }

    public Iterable<VideoCassette> findAll() {
        return this.videoCassetteRepo.findAll();
    }

    public VideoCassette save(VideoCassette videoCassette) {
        return this.videoCassetteRepo.save(videoCassette);
    }

    public void delete(Long id) {
        this.videoCassetteRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {
        this.save(new VideoCassette(1L, "Title1", LocalDate.of(2001, 1, 1)));
        this.save(new VideoCassette(2L, "Title2", LocalDate.of(2002, 2, 2)));
        this.save(new VideoCassette(3L, "Title3", LocalDate.of(2003, 3, 3)));
    }
}
