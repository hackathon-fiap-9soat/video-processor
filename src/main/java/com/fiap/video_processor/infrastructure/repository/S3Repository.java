package com.fiap.video_processor.infrastructure.repository;

import java.io.IOException;
import java.nio.file.Path;

public interface S3Repository {
    Path downloadToTempFile(String videoId, Path workingDir) throws IOException;
}
