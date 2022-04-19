package io.lab.Filmy.api;

import io.lab.Filmy.dao.IVideoCassetteRepo;
import io.lab.Filmy.dao.entity.VideoCassette;
import io.lab.Filmy.manager.VideoCassetteManager;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cassetts")
public class VideoCassetteApi {
    private VideoCassetteManager videoCassetteManager;

    public VideoCassetteApi(VideoCassetteManager videoCassetteManager) {
        this.videoCassetteManager = videoCassetteManager;
    }

    @GetMapping("/all")
    public Iterable<VideoCassette> getAll() {
        return this.videoCassetteManager.findAll();
    }

    @GetMapping()
    public Optional<VideoCassette> getById(@RequestParam Long id) {
        return this.videoCassetteManager.findById(id);
    }

    @PostMapping
    public VideoCassette addVideo(@RequestBody VideoCassette videoCassette) {
        return this.videoCassetteManager.save(videoCassette);
    }

    @PutMapping()
    public VideoCassette updateVideo(@RequestBody VideoCassette videoCassette) {
        return this.videoCassetteManager.save(videoCassette);
    }

    @DeleteMapping
    public void deleteVideo(@RequestParam Long id) {
        this.videoCassetteManager.delete(id);
    }
}
