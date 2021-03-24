package com.lucasjosino.on_audio_query.types

import android.graphics.Bitmap
import android.net.Uri
import android.provider.MediaStore

fun checkArtworkType(sortType: Int): Uri {
    return when (sortType) {
        0 -> MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
        1 -> MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI
        else -> MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
    }
}

fun checkArtworkFormat(format: Int) : Bitmap.CompressFormat {
    return when (format) {
        0 -> Bitmap.CompressFormat.JPEG
        1 -> Bitmap.CompressFormat.PNG
        else -> Bitmap.CompressFormat.JPEG
    }
}