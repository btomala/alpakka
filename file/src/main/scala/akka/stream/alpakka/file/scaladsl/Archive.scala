/*
 * Copyright (C) 2016-2020 Lightbend Inc. <https://www.lightbend.com>
 */

package akka.stream.alpakka.file.scaladsl

import akka.NotUsed
import akka.stream.alpakka.file.ArchiveMetadata
import akka.stream.alpakka.file.impl.archive.ZipArchiveManager
import akka.stream.scaladsl.{Flow, Source}
import akka.util.ByteString

/**
 * Scala API.
 */
object Archive {

  /**
   * Flow for compressing multiple files into one ZIP file.
   */
  def zip(): Flow[(ArchiveMetadata, Source[ByteString, Any]), ByteString, NotUsed] =
    ZipArchiveManager.zipFlow()

}
