package com.altmann.choresmanager.res.myiconpack

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Brush.Companion.radialGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.altmann.choresmanager.res.MyIconPack

public val MyIconPack.Duration6Achievement: ImageVector
    get() {
        if (_duration6Achievement != null) {
            return _duration6Achievement!!
        }
        _duration6Achievement = Builder(name = "Duration6Achievement", defaultWidth = 238.0.dp,
                defaultHeight = 238.0.dp, viewportWidth = 238.0f, viewportHeight = 238.0f).apply {
            path(fill = SolidColor(Color(0xFF1E1E1E)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(238.0f)
                verticalLineToRelative(238.0f)
                horizontalLineToRelative(-238.0f)
                close()
            }
            group {
                path(fill = SolidColor(Color(0xFF096972)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(238.0f, 0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(238.0f)
                    horizontalLineTo(238.0f)
                    verticalLineTo(0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF1BB7C5), 1.0f to Color(0xFF0D093F),
                        start = Offset(119.0f,-125.2f), end = Offset(119.0f,238.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(0.0f, -125.2f)
                    curveTo(6.33f, -123.03f, 25.97f, -118.49f, 37.97f, -112.17f)
                    curveTo(49.96f, -105.84f, 61.96f, -92.9f, 71.97f, -87.23f)
                    curveTo(81.98f, -81.56f, 88.02f, -82.51f, 98.03f, -78.16f)
                    curveTo(108.04f, -73.82f, 119.38f, -68.15f, 132.03f, -61.16f)
                    curveTo(144.69f, -54.18f, 161.31f, -41.9f, 173.97f, -36.23f)
                    curveTo(186.62f, -30.56f, 197.29f, -32.17f, 207.97f, -27.16f)
                    curveTo(218.64f, -22.16f, 232.99f, -9.69f, 238.0f, -6.2f)
                    verticalLineTo(238.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(-125.2f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF1BB7C5), 1.0f to Color(0xFF0D093F),
                        start = Offset(119.0f,-59.11f), end = Offset(119.0f,238.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(0.0f, -59.11f)
                    curveTo(5.01f, -55.3f, 19.36f, -43.21f, 30.03f, -36.25f)
                    curveTo(40.71f, -29.3f, 52.7f, -22.34f, 64.03f, -17.36f)
                    curveTo(75.37f, -12.39f, 85.38f, -11.38f, 98.03f, -6.4f)
                    curveTo(110.69f, -1.43f, 128.63f, 6.19f, 139.97f, 12.49f)
                    curveTo(151.3f, 18.79f, 154.7f, 23.76f, 166.03f, 31.38f)
                    curveTo(177.37f, 39.0f, 195.97f, 51.25f, 207.97f, 58.21f)
                    curveTo(219.96f, 65.17f, 232.99f, 70.65f, 238.0f, 73.14f)
                    verticalLineTo(238.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(-59.11f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF1BB7C5), 1.0f to Color(0xFF0D093F),
                        start = Offset(119.0f,19.37f), end = Offset(119.0f,238.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(0.0f, 19.37f)
                    curveTo(5.95f, 22.75f, 21.82f, 32.23f, 35.7f, 39.65f)
                    curveTo(49.58f, 47.07f, 70.08f, 55.82f, 83.3f, 63.9f)
                    curveTo(96.52f, 71.98f, 103.13f, 80.07f, 115.03f, 88.15f)
                    curveTo(126.93f, 96.23f, 141.48f, 102.99f, 154.7f, 112.4f)
                    curveTo(167.92f, 121.8f, 180.48f, 135.84f, 194.37f, 144.58f)
                    curveTo(208.25f, 153.33f, 230.73f, 161.48f, 238.0f, 164.87f)
                    verticalLineTo(238.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(19.37f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xA0FFFFFF), 1.0f to Color(0x38FFFFFF),
                        start = Offset(119.0f,182.0f), end = Offset(119.0f,219.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(23.0f, 182.0f)
                    lineTo(215.0f, 182.0f)
                    arcTo(8.0f, 8.0f, 0.0f, false, true, 223.0f, 190.0f)
                    lineTo(223.0f, 211.0f)
                    arcTo(8.0f, 8.0f, 0.0f, false, true, 215.0f, 219.0f)
                    lineTo(23.0f, 219.0f)
                    arcTo(8.0f, 8.0f, 0.0f, false, true, 15.0f, 211.0f)
                    lineTo(15.0f, 190.0f)
                    arcTo(8.0f, 8.0f, 0.0f, false, true, 23.0f, 182.0f)
                    close()
                }
                path(fill = linearGradient(0.07f to Color(0xFF000334), 0.42f to Color(0xFF00BDEC),
                        start = Offset(118.38f,211.29f), end = Offset(118.38f,190.36f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(51.03f, 198.01f)
                    horizontalLineTo(46.05f)
                    curveTo(45.99f, 197.5f, 45.85f, 197.04f, 45.65f, 196.63f)
                    curveTo(45.44f, 196.22f, 45.17f, 195.87f, 44.83f, 195.58f)
                    curveTo(44.49f, 195.29f, 44.09f, 195.06f, 43.63f, 194.91f)
                    curveTo(43.17f, 194.75f, 42.66f, 194.67f, 42.11f, 194.67f)
                    curveTo(41.12f, 194.67f, 40.27f, 194.91f, 39.55f, 195.4f)
                    curveTo(38.84f, 195.88f, 38.29f, 196.58f, 37.91f, 197.5f)
                    curveTo(37.53f, 198.41f, 37.34f, 199.52f, 37.34f, 200.82f)
                    curveTo(37.34f, 202.17f, 37.54f, 203.3f, 37.92f, 204.22f)
                    curveTo(38.31f, 205.13f, 38.86f, 205.81f, 39.56f, 206.28f)
                    curveTo(40.27f, 206.73f, 41.11f, 206.96f, 42.08f, 206.96f)
                    curveTo(42.62f, 206.96f, 43.11f, 206.89f, 43.56f, 206.75f)
                    curveTo(44.01f, 206.62f, 44.4f, 206.41f, 44.74f, 206.15f)
                    curveTo(45.09f, 205.88f, 45.37f, 205.55f, 45.59f, 205.16f)
                    curveTo(45.81f, 204.77f, 45.97f, 204.33f, 46.05f, 203.84f)
                    lineTo(51.03f, 203.87f)
                    curveTo(50.94f, 204.77f, 50.68f, 205.66f, 50.24f, 206.54f)
                    curveTo(49.81f, 207.41f, 49.22f, 208.21f, 48.46f, 208.93f)
                    curveTo(47.7f, 209.65f, 46.78f, 210.22f, 45.7f, 210.64f)
                    curveTo(44.62f, 211.07f, 43.38f, 211.28f, 41.98f, 211.28f)
                    curveTo(40.13f, 211.28f, 38.48f, 210.87f, 37.03f, 210.07f)
                    curveTo(35.57f, 209.25f, 34.43f, 208.06f, 33.59f, 206.51f)
                    curveTo(32.74f, 204.95f, 32.32f, 203.05f, 32.32f, 200.82f)
                    curveTo(32.32f, 198.58f, 32.75f, 196.68f, 33.61f, 195.12f)
                    curveTo(34.46f, 193.56f, 35.62f, 192.38f, 37.08f, 191.57f)
                    curveTo(38.53f, 190.76f, 40.17f, 190.36f, 41.98f, 190.36f)
                    curveTo(43.21f, 190.36f, 44.35f, 190.53f, 45.4f, 190.88f)
                    curveTo(46.45f, 191.21f, 47.37f, 191.71f, 48.16f, 192.37f)
                    curveTo(48.96f, 193.02f, 49.6f, 193.82f, 50.1f, 194.76f)
                    curveTo(50.6f, 195.71f, 50.91f, 196.79f, 51.03f, 198.01f)
                    close()
                }
                path(fill = linearGradient(0.07f to Color(0xFF000334), 0.42f to Color(0xFF00BDEC),
                        start = Offset(118.38f,211.29f), end = Offset(118.38f,190.36f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(58.7f, 202.29f)
                    verticalLineTo(211.0f)
                    horizontalLineTo(53.84f)
                    verticalLineTo(190.64f)
                    horizontalLineTo(58.55f)
                    verticalLineTo(198.53f)
                    horizontalLineTo(58.71f)
                    curveTo(59.06f, 197.59f, 59.62f, 196.85f, 60.4f, 196.32f)
                    curveTo(61.19f, 195.79f, 62.16f, 195.53f, 63.3f, 195.53f)
                    curveTo(64.37f, 195.53f, 65.31f, 195.77f, 66.1f, 196.24f)
                    curveTo(66.9f, 196.71f, 67.51f, 197.38f, 67.95f, 198.24f)
                    curveTo(68.4f, 199.1f, 68.61f, 200.11f, 68.61f, 201.27f)
                    verticalLineTo(211.0f)
                    horizontalLineTo(63.75f)
                    verticalLineTo(202.22f)
                    curveTo(63.75f, 201.37f, 63.54f, 200.71f, 63.11f, 200.23f)
                    curveTo(62.68f, 199.75f, 62.07f, 199.52f, 61.29f, 199.52f)
                    curveTo(60.78f, 199.52f, 60.33f, 199.63f, 59.94f, 199.85f)
                    curveTo(59.55f, 200.07f, 59.25f, 200.39f, 59.03f, 200.8f)
                    curveTo(58.82f, 201.21f, 58.71f, 201.71f, 58.7f, 202.29f)
                    close()
                }
                path(fill = linearGradient(0.07f to Color(0xFF000334), 0.42f to Color(0xFF00BDEC),
                        start = Offset(118.38f,211.29f), end = Offset(118.38f,190.36f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(78.77f, 211.29f)
                    curveTo(77.17f, 211.29f, 75.79f, 210.96f, 74.64f, 210.3f)
                    curveTo(73.49f, 209.64f, 72.6f, 208.72f, 71.98f, 207.54f)
                    curveTo(71.36f, 206.35f, 71.06f, 204.98f, 71.06f, 203.41f)
                    curveTo(71.06f, 201.84f, 71.36f, 200.47f, 71.98f, 199.29f)
                    curveTo(72.6f, 198.1f, 73.49f, 197.18f, 74.64f, 196.52f)
                    curveTo(75.79f, 195.86f, 77.17f, 195.53f, 78.77f, 195.53f)
                    curveTo(80.38f, 195.53f, 81.75f, 195.86f, 82.9f, 196.52f)
                    curveTo(84.05f, 197.18f, 84.94f, 198.1f, 85.55f, 199.29f)
                    curveTo(86.18f, 200.47f, 86.49f, 201.84f, 86.49f, 203.41f)
                    curveTo(86.49f, 204.98f, 86.18f, 206.35f, 85.55f, 207.54f)
                    curveTo(84.94f, 208.72f, 84.05f, 209.64f, 82.9f, 210.3f)
                    curveTo(81.75f, 210.96f, 80.38f, 211.29f, 78.77f, 211.29f)
                    close()
                    moveTo(78.8f, 207.62f)
                    curveTo(79.39f, 207.62f, 79.88f, 207.44f, 80.28f, 207.08f)
                    curveTo(80.69f, 206.72f, 81.0f, 206.23f, 81.21f, 205.59f)
                    curveTo(81.43f, 204.96f, 81.54f, 204.22f, 81.54f, 203.38f)
                    curveTo(81.54f, 202.54f, 81.43f, 201.79f, 81.21f, 201.16f)
                    curveTo(81.0f, 200.52f, 80.69f, 200.02f, 80.28f, 199.66f)
                    curveTo(79.88f, 199.31f, 79.39f, 199.13f, 78.8f, 199.13f)
                    curveTo(78.2f, 199.13f, 77.69f, 199.31f, 77.27f, 199.66f)
                    curveTo(76.86f, 200.02f, 76.54f, 200.52f, 76.33f, 201.16f)
                    curveTo(76.11f, 201.79f, 76.01f, 202.54f, 76.01f, 203.38f)
                    curveTo(76.01f, 204.22f, 76.11f, 204.96f, 76.33f, 205.59f)
                    curveTo(76.54f, 206.23f, 76.86f, 206.72f, 77.27f, 207.08f)
                    curveTo(77.69f, 207.44f, 78.2f, 207.62f, 78.8f, 207.62f)
                    close()
                }
                path(fill = linearGradient(0.07f to Color(0xFF000334), 0.42f to Color(0xFF00BDEC),
                        start = Offset(118.38f,211.29f), end = Offset(118.38f,190.36f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(88.98f, 211.0f)
                    verticalLineTo(195.73f)
                    horizontalLineTo(93.7f)
                    verticalLineTo(198.51f)
                    horizontalLineTo(93.86f)
                    curveTo(94.14f, 197.5f, 94.59f, 196.76f, 95.22f, 196.26f)
                    curveTo(95.85f, 195.77f, 96.59f, 195.52f, 97.42f, 195.52f)
                    curveTo(97.65f, 195.52f, 97.88f, 195.54f, 98.12f, 195.57f)
                    curveTo(98.36f, 195.6f, 98.58f, 195.64f, 98.78f, 195.7f)
                    verticalLineTo(199.92f)
                    curveTo(98.55f, 199.84f, 98.25f, 199.78f, 97.87f, 199.73f)
                    curveTo(97.5f, 199.69f, 97.17f, 199.66f, 96.87f, 199.66f)
                    curveTo(96.3f, 199.66f, 95.78f, 199.79f, 95.31f, 200.05f)
                    curveTo(94.86f, 200.3f, 94.49f, 200.66f, 94.23f, 201.12f)
                    curveTo(93.97f, 201.57f, 93.84f, 202.1f, 93.84f, 202.71f)
                    verticalLineTo(211.0f)
                    horizontalLineTo(88.98f)
                    close()
                }
                path(fill = linearGradient(0.07f to Color(0xFF000334), 0.42f to Color(0xFF00BDEC),
                        start = Offset(118.38f,211.29f), end = Offset(118.38f,190.36f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(107.11f, 211.29f)
                    curveTo(105.51f, 211.29f, 104.13f, 210.97f, 102.97f, 210.34f)
                    curveTo(101.82f, 209.71f, 100.93f, 208.8f, 100.31f, 207.63f)
                    curveTo(99.69f, 206.45f, 99.38f, 205.05f, 99.38f, 203.42f)
                    curveTo(99.38f, 201.85f, 99.7f, 200.47f, 100.32f, 199.29f)
                    curveTo(100.94f, 198.1f, 101.82f, 197.18f, 102.95f, 196.52f)
                    curveTo(104.09f, 195.86f, 105.42f, 195.53f, 106.96f, 195.53f)
                    curveTo(108.05f, 195.53f, 109.04f, 195.7f, 109.94f, 196.04f)
                    curveTo(110.85f, 196.37f, 111.62f, 196.87f, 112.28f, 197.54f)
                    curveTo(112.94f, 198.2f, 113.45f, 199.02f, 113.81f, 199.99f)
                    curveTo(114.18f, 200.96f, 114.36f, 202.07f, 114.36f, 203.32f)
                    verticalLineTo(204.54f)
                    horizontalLineTo(101.08f)
                    verticalLineTo(201.71f)
                    horizontalLineTo(109.83f)
                    curveTo(109.83f, 201.2f, 109.71f, 200.74f, 109.47f, 200.33f)
                    curveTo(109.23f, 199.93f, 108.9f, 199.61f, 108.48f, 199.39f)
                    curveTo(108.07f, 199.15f, 107.6f, 199.04f, 107.06f, 199.04f)
                    curveTo(106.52f, 199.04f, 106.03f, 199.16f, 105.6f, 199.41f)
                    curveTo(105.17f, 199.65f, 104.83f, 199.97f, 104.57f, 200.39f)
                    curveTo(104.32f, 200.8f, 104.19f, 201.27f, 104.18f, 201.79f)
                    verticalLineTo(204.67f)
                    curveTo(104.18f, 205.29f, 104.3f, 205.84f, 104.54f, 206.31f)
                    curveTo(104.79f, 206.77f, 105.14f, 207.13f, 105.59f, 207.39f)
                    curveTo(106.04f, 207.65f, 106.58f, 207.78f, 107.2f, 207.78f)
                    curveTo(107.63f, 207.78f, 108.02f, 207.72f, 108.37f, 207.6f)
                    curveTo(108.72f, 207.48f, 109.03f, 207.3f, 109.28f, 207.07f)
                    curveTo(109.53f, 206.84f, 109.72f, 206.55f, 109.84f, 206.22f)
                    lineTo(114.31f, 206.35f)
                    curveTo(114.12f, 207.35f, 113.72f, 208.22f, 113.09f, 208.96f)
                    curveTo(112.46f, 209.7f, 111.64f, 210.27f, 110.63f, 210.68f)
                    curveTo(109.62f, 211.09f, 108.44f, 211.29f, 107.11f, 211.29f)
                    close()
                }
                path(fill = linearGradient(0.07f to Color(0xFF000334), 0.42f to Color(0xFF00BDEC),
                        start = Offset(118.38f,211.29f), end = Offset(118.38f,190.36f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(122.86f, 211.0f)
                    verticalLineTo(190.64f)
                    horizontalLineTo(127.78f)
                    verticalLineTo(198.81f)
                    horizontalLineTo(135.8f)
                    verticalLineTo(190.64f)
                    horizontalLineTo(140.72f)
                    verticalLineTo(211.0f)
                    horizontalLineTo(135.8f)
                    verticalLineTo(202.82f)
                    horizontalLineTo(127.78f)
                    verticalLineTo(211.0f)
                    horizontalLineTo(122.86f)
                    close()
                }
                path(fill = linearGradient(0.07f to Color(0xFF000334), 0.42f to Color(0xFF00BDEC),
                        start = Offset(118.38f,211.29f), end = Offset(118.38f,190.36f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(150.93f, 211.29f)
                    curveTo(149.33f, 211.29f, 147.95f, 210.96f, 146.8f, 210.3f)
                    curveTo(145.65f, 209.64f, 144.76f, 208.72f, 144.14f, 207.54f)
                    curveTo(143.52f, 206.35f, 143.22f, 204.98f, 143.22f, 203.41f)
                    curveTo(143.22f, 201.84f, 143.52f, 200.47f, 144.14f, 199.29f)
                    curveTo(144.76f, 198.1f, 145.65f, 197.18f, 146.8f, 196.52f)
                    curveTo(147.95f, 195.86f, 149.33f, 195.53f, 150.93f, 195.53f)
                    curveTo(152.54f, 195.53f, 153.91f, 195.86f, 155.06f, 196.52f)
                    curveTo(156.21f, 197.18f, 157.1f, 198.1f, 157.71f, 199.29f)
                    curveTo(158.34f, 200.47f, 158.65f, 201.84f, 158.65f, 203.41f)
                    curveTo(158.65f, 204.98f, 158.34f, 206.35f, 157.71f, 207.54f)
                    curveTo(157.1f, 208.72f, 156.21f, 209.64f, 155.06f, 210.3f)
                    curveTo(153.91f, 210.96f, 152.54f, 211.29f, 150.93f, 211.29f)
                    close()
                    moveTo(150.96f, 207.62f)
                    curveTo(151.54f, 207.62f, 152.04f, 207.44f, 152.44f, 207.08f)
                    curveTo(152.85f, 206.72f, 153.16f, 206.23f, 153.37f, 205.59f)
                    curveTo(153.59f, 204.96f, 153.7f, 204.22f, 153.7f, 203.38f)
                    curveTo(153.7f, 202.54f, 153.59f, 201.79f, 153.37f, 201.16f)
                    curveTo(153.16f, 200.52f, 152.85f, 200.02f, 152.44f, 199.66f)
                    curveTo(152.04f, 199.31f, 151.54f, 199.13f, 150.96f, 199.13f)
                    curveTo(150.36f, 199.13f, 149.85f, 199.31f, 149.43f, 199.66f)
                    curveTo(149.02f, 200.02f, 148.71f, 200.52f, 148.49f, 201.16f)
                    curveTo(148.27f, 201.79f, 148.17f, 202.54f, 148.17f, 203.38f)
                    curveTo(148.17f, 204.22f, 148.27f, 204.96f, 148.49f, 205.59f)
                    curveTo(148.71f, 206.23f, 149.02f, 206.72f, 149.43f, 207.08f)
                    curveTo(149.85f, 207.44f, 150.36f, 207.62f, 150.96f, 207.62f)
                    close()
                }
                path(fill = linearGradient(0.07f to Color(0xFF000334), 0.42f to Color(0xFF00BDEC),
                        start = Offset(118.38f,211.29f), end = Offset(118.38f,190.36f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(170.99f, 204.41f)
                    verticalLineTo(195.73f)
                    horizontalLineTo(175.85f)
                    verticalLineTo(211.0f)
                    horizontalLineTo(171.21f)
                    verticalLineTo(208.16f)
                    horizontalLineTo(171.05f)
                    curveTo(170.71f, 209.09f, 170.14f, 209.83f, 169.32f, 210.38f)
                    curveTo(168.51f, 210.93f, 167.54f, 211.2f, 166.39f, 211.2f)
                    curveTo(165.35f, 211.2f, 164.43f, 210.96f, 163.65f, 210.48f)
                    curveTo(162.86f, 210.01f, 162.24f, 209.34f, 161.8f, 208.48f)
                    curveTo(161.37f, 207.62f, 161.15f, 206.62f, 161.14f, 205.46f)
                    verticalLineTo(195.73f)
                    horizontalLineTo(166.0f)
                    verticalLineTo(204.51f)
                    curveTo(166.01f, 205.34f, 166.23f, 205.99f, 166.66f, 206.47f)
                    curveTo(167.09f, 206.94f, 167.68f, 207.18f, 168.42f, 207.18f)
                    curveTo(168.9f, 207.18f, 169.34f, 207.08f, 169.72f, 206.86f)
                    curveTo(170.11f, 206.65f, 170.42f, 206.33f, 170.65f, 205.92f)
                    curveTo(170.88f, 205.5f, 170.99f, 205.0f, 170.99f, 204.41f)
                    close()
                }
                path(fill = linearGradient(0.07f to Color(0xFF000334), 0.42f to Color(0xFF00BDEC),
                        start = Offset(118.38f,211.29f), end = Offset(118.38f,190.36f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(178.94f, 211.0f)
                    verticalLineTo(195.73f)
                    horizontalLineTo(183.66f)
                    verticalLineTo(198.51f)
                    horizontalLineTo(183.82f)
                    curveTo(184.1f, 197.5f, 184.55f, 196.76f, 185.18f, 196.26f)
                    curveTo(185.81f, 195.77f, 186.55f, 195.52f, 187.38f, 195.52f)
                    curveTo(187.61f, 195.52f, 187.84f, 195.54f, 188.08f, 195.57f)
                    curveTo(188.32f, 195.6f, 188.54f, 195.64f, 188.74f, 195.7f)
                    verticalLineTo(199.92f)
                    curveTo(188.51f, 199.84f, 188.21f, 199.78f, 187.83f, 199.73f)
                    curveTo(187.46f, 199.69f, 187.13f, 199.66f, 186.84f, 199.66f)
                    curveTo(186.26f, 199.66f, 185.74f, 199.79f, 185.27f, 200.05f)
                    curveTo(184.82f, 200.3f, 184.46f, 200.66f, 184.19f, 201.12f)
                    curveTo(183.93f, 201.57f, 183.8f, 202.1f, 183.8f, 202.71f)
                    verticalLineTo(211.0f)
                    horizontalLineTo(178.94f)
                    close()
                }
                path(fill = linearGradient(0.07f to Color(0xFF000334), 0.42f to Color(0xFF00BDEC),
                        start = Offset(118.38f,211.29f), end = Offset(118.38f,190.36f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(204.06f, 200.39f)
                    lineTo(199.59f, 200.51f)
                    curveTo(199.55f, 200.19f, 199.42f, 199.91f, 199.22f, 199.66f)
                    curveTo(199.01f, 199.41f, 198.74f, 199.22f, 198.41f, 199.08f)
                    curveTo(198.09f, 198.93f, 197.71f, 198.86f, 197.28f, 198.86f)
                    curveTo(196.71f, 198.86f, 196.23f, 198.97f, 195.84f, 199.2f)
                    curveTo(195.44f, 199.42f, 195.25f, 199.73f, 195.26f, 200.11f)
                    curveTo(195.25f, 200.41f, 195.37f, 200.67f, 195.62f, 200.89f)
                    curveTo(195.87f, 201.11f, 196.32f, 201.28f, 196.96f, 201.41f)
                    lineTo(199.9f, 201.97f)
                    curveTo(201.43f, 202.26f, 202.56f, 202.75f, 203.3f, 203.42f)
                    curveTo(204.05f, 204.1f, 204.43f, 204.99f, 204.44f, 206.11f)
                    curveTo(204.43f, 207.15f, 204.12f, 208.07f, 203.5f, 208.84f)
                    curveTo(202.89f, 209.62f, 202.06f, 210.22f, 201.0f, 210.65f)
                    curveTo(199.93f, 211.08f, 198.72f, 211.29f, 197.36f, 211.29f)
                    curveTo(195.18f, 211.29f, 193.46f, 210.84f, 192.2f, 209.95f)
                    curveTo(190.94f, 209.04f, 190.23f, 207.84f, 190.05f, 206.33f)
                    lineTo(194.85f, 206.21f)
                    curveTo(194.96f, 206.76f, 195.23f, 207.19f, 195.68f, 207.48f)
                    curveTo(196.12f, 207.77f, 196.69f, 207.92f, 197.38f, 207.92f)
                    curveTo(198.0f, 207.92f, 198.51f, 207.8f, 198.9f, 207.57f)
                    curveTo(199.29f, 207.34f, 199.49f, 207.03f, 199.49f, 206.65f)
                    curveTo(199.49f, 206.3f, 199.34f, 206.02f, 199.04f, 205.82f)
                    curveTo(198.74f, 205.61f, 198.27f, 205.44f, 197.63f, 205.32f)
                    lineTo(194.97f, 204.82f)
                    curveTo(193.44f, 204.54f, 192.3f, 204.02f, 191.55f, 203.27f)
                    curveTo(190.8f, 202.52f, 190.43f, 201.56f, 190.44f, 200.39f)
                    curveTo(190.43f, 199.37f, 190.7f, 198.5f, 191.25f, 197.78f)
                    curveTo(191.8f, 197.05f, 192.58f, 196.49f, 193.6f, 196.1f)
                    curveTo(194.61f, 195.72f, 195.81f, 195.53f, 197.19f, 195.53f)
                    curveTo(199.26f, 195.53f, 200.89f, 195.96f, 202.08f, 196.83f)
                    curveTo(203.27f, 197.69f, 203.93f, 198.88f, 204.06f, 200.39f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFFEFEF)), stroke = null, fillAlpha = 0.35f,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(69.0f, 148.0f)
                    arcToRelative(50.5f, 6.0f, 0.0f, true, false, 101.0f, 0.0f)
                    arcToRelative(50.5f, 6.0f, 0.0f, true, false, -101.0f, 0.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xD3FFFFFF), 1.0f to Color(0x00737373),
                        start = Offset(119.0f,45.5f), end = Offset(119.0f,150.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(86.0f, 43.25f)
                    lineTo(152.0f, 43.25f)
                    arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 55.25f)
                    lineTo(164.0f, 125.0f)
                    arcTo(12.0f, 12.0f, 0.0f, false, true, 152.0f, 137.0f)
                    lineTo(86.0f, 137.0f)
                    arcTo(12.0f, 12.0f, 0.0f, false, true, 74.0f, 125.0f)
                    lineTo(74.0f, 55.25f)
                    arcTo(12.0f, 12.0f, 0.0f, false, true, 86.0f, 43.25f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF00ADD8)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(74.0f, 55.19f)
                    curveTo(74.0f, 48.56f, 79.37f, 43.19f, 86.0f, 43.19f)
                    horizontalLineTo(152.0f)
                    curveTo(158.63f, 43.19f, 164.0f, 48.56f, 164.0f, 55.19f)
                    verticalLineTo(56.99f)
                    horizontalLineTo(74.0f)
                    verticalLineTo(55.19f)
                    close()
                }
                path(fill = radialGradient(0.0f to Color(0x00ED3AF3), 1.0f to Color(0x42000000),
                        center = Offset(119.0f,50.09f), radius = 40.42f), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(74.0f, 55.19f)
                    curveTo(74.0f, 48.56f, 79.37f, 43.19f, 86.0f, 43.19f)
                    horizontalLineTo(152.0f)
                    curveTo(158.63f, 43.19f, 164.0f, 48.56f, 164.0f, 55.19f)
                    verticalLineTo(56.99f)
                    horizontalLineTo(74.0f)
                    verticalLineTo(55.19f)
                    close()
                }
            }
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(89.91f, 49.85f)
                    arcToRelative(4.11f, 4.28f, 0.0f, true, false, 8.22f, 0.0f)
                    arcToRelative(4.11f, 4.28f, 0.0f, true, false, -8.22f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(90.83f, 49.85f)
                    arcToRelative(3.2f, 3.33f, 0.0f, true, false, 6.4f, 0.0f)
                    arcToRelative(3.2f, 3.33f, 0.0f, true, false, -6.4f, 0.0f)
                    close()
                }
                path(fill = radialGradient(0.27f to Color(0xFFD9D9D9), 0.64f to Color(0xFFA6A6A6),
                        1.0f to Color(0xFF737373), center = Offset(94.03f,44.85f), radius = 7.85f),
                        stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin
                        = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(94.03f, 37.0f)
                    lineTo(94.03f, 37.0f)
                    arcTo(2.74f, 2.74f, 0.0f, false, true, 96.77f, 39.74f)
                    lineTo(96.77f, 49.96f)
                    arcTo(2.74f, 2.74f, 0.0f, false, true, 94.03f, 52.7f)
                    lineTo(94.03f, 52.7f)
                    arcTo(2.74f, 2.74f, 0.0f, false, true, 91.28f, 49.96f)
                    lineTo(91.28f, 39.74f)
                    arcTo(2.74f, 2.74f, 0.0f, false, true, 94.03f, 37.0f)
                    close()
                }
            }
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(140.17f, 49.85f)
                    arcToRelative(4.11f, 4.28f, 0.0f, true, false, 8.22f, 0.0f)
                    arcToRelative(4.11f, 4.28f, 0.0f, true, false, -8.22f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(141.08f, 49.85f)
                    arcToRelative(3.2f, 3.33f, 0.0f, true, false, 6.4f, 0.0f)
                    arcToRelative(3.2f, 3.33f, 0.0f, true, false, -6.4f, 0.0f)
                    close()
                }
                path(fill = radialGradient(0.27f to Color(0xFFD9D9D9), 0.64f to Color(0xFFA6A6A6),
                        1.0f to Color(0xFF737373), center = Offset(144.28f,44.85f), radius = 7.85f),
                        stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin
                        = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(144.28f, 37.0f)
                    lineTo(144.28f, 37.0f)
                    arcTo(2.74f, 2.74f, 0.0f, false, true, 147.02f, 39.74f)
                    lineTo(147.02f, 49.96f)
                    arcTo(2.74f, 2.74f, 0.0f, false, true, 144.28f, 52.7f)
                    lineTo(144.28f, 52.7f)
                    arcTo(2.74f, 2.74f, 0.0f, false, true, 141.54f, 49.96f)
                    lineTo(141.54f, 39.74f)
                    arcTo(2.74f, 2.74f, 0.0f, false, true, 144.28f, 37.0f)
                    close()
                }
                path(fill = linearGradient(0.34f to Color(0xFF00ADD8), 1.0f to Color(0xFF000334),
                        start = Offset(121.5f,75.0f), end = Offset(121.5f,114.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(110.34f, 106.57f)
                    curveTo(108.31f, 106.57f, 106.56f, 106.09f, 105.09f, 105.13f)
                    curveTo(103.62f, 104.15f, 102.49f, 102.76f, 101.69f, 100.96f)
                    curveTo(100.9f, 99.14f, 100.5f, 96.95f, 100.51f, 94.4f)
                    curveTo(100.52f, 91.84f, 100.92f, 89.68f, 101.71f, 87.9f)
                    curveTo(102.5f, 86.11f, 103.63f, 84.75f, 105.09f, 83.82f)
                    curveTo(106.56f, 82.88f, 108.31f, 82.41f, 110.34f, 82.41f)
                    curveTo(112.37f, 82.41f, 114.12f, 82.88f, 115.59f, 83.82f)
                    curveTo(117.07f, 84.75f, 118.21f, 86.11f, 119.0f, 87.9f)
                    curveTo(119.79f, 89.69f, 120.19f, 91.85f, 120.18f, 94.4f)
                    curveTo(120.18f, 96.96f, 119.78f, 99.15f, 118.99f, 100.97f)
                    curveTo(118.19f, 102.78f, 117.06f, 104.17f, 115.59f, 105.14f)
                    curveTo(114.13f, 106.09f, 112.38f, 106.57f, 110.34f, 106.57f)
                    close()
                    moveTo(110.34f, 101.97f)
                    curveTo(111.55f, 101.97f, 112.53f, 101.35f, 113.28f, 100.11f)
                    curveTo(114.03f, 98.87f, 114.4f, 96.97f, 114.4f, 94.4f)
                    curveTo(114.4f, 92.72f, 114.23f, 91.33f, 113.89f, 90.24f)
                    curveTo(113.54f, 89.14f, 113.07f, 88.32f, 112.47f, 87.78f)
                    curveTo(111.86f, 87.25f, 111.15f, 86.98f, 110.34f, 86.98f)
                    curveTo(109.14f, 86.98f, 108.16f, 87.59f, 107.42f, 88.81f)
                    curveTo(106.68f, 90.02f, 106.3f, 91.88f, 106.29f, 94.4f)
                    curveTo(106.29f, 96.1f, 106.45f, 97.52f, 106.78f, 98.64f)
                    curveTo(107.13f, 99.76f, 107.6f, 100.6f, 108.22f, 101.15f)
                    curveTo(108.83f, 101.69f, 109.54f, 101.97f, 110.34f, 101.97f)
                    close()
                }
                path(fill = linearGradient(0.34f to Color(0xFF00ADD8), 1.0f to Color(0xFF000334),
                        start = Offset(121.5f,75.0f), end = Offset(121.5f,114.0f)), stroke = null,
                        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(132.73f, 106.32f)
                    curveTo(131.46f, 106.32f, 130.24f, 106.11f, 129.07f, 105.71f)
                    curveTo(127.91f, 105.29f, 126.87f, 104.63f, 125.96f, 103.73f)
                    curveTo(125.05f, 102.82f, 124.33f, 101.63f, 123.81f, 100.16f)
                    curveTo(123.29f, 98.68f, 123.03f, 96.88f, 123.04f, 94.76f)
                    curveTo(123.05f, 92.84f, 123.28f, 91.13f, 123.74f, 89.6f)
                    curveTo(124.21f, 88.07f, 124.87f, 86.77f, 125.72f, 85.7f)
                    curveTo(126.58f, 84.64f, 127.62f, 83.82f, 128.81f, 83.26f)
                    curveTo(130.02f, 82.69f, 131.36f, 82.41f, 132.85f, 82.41f)
                    curveTo(134.48f, 82.41f, 135.91f, 82.73f, 137.15f, 83.36f)
                    curveTo(138.4f, 83.99f, 139.4f, 84.84f, 140.15f, 85.91f)
                    curveTo(140.9f, 86.97f, 141.35f, 88.15f, 141.48f, 89.45f)
                    horizontalLineTo(135.95f)
                    curveTo(135.78f, 88.72f, 135.41f, 88.16f, 134.85f, 87.78f)
                    curveTo(134.29f, 87.4f, 133.62f, 87.2f, 132.85f, 87.2f)
                    curveTo(131.42f, 87.2f, 130.36f, 87.82f, 129.65f, 89.06f)
                    curveTo(128.96f, 90.29f, 128.6f, 91.94f, 128.59f, 94.01f)
                    horizontalLineTo(128.73f)
                    curveTo(129.05f, 93.31f, 129.51f, 92.72f, 130.11f, 92.22f)
                    curveTo(130.71f, 91.72f, 131.39f, 91.33f, 132.16f, 91.07f)
                    curveTo(132.95f, 90.8f, 133.77f, 90.66f, 134.64f, 90.66f)
                    curveTo(136.04f, 90.66f, 137.27f, 90.98f, 138.34f, 91.63f)
                    curveTo(139.4f, 92.27f, 140.24f, 93.15f, 140.85f, 94.27f)
                    curveTo(141.45f, 95.39f, 141.75f, 96.66f, 141.74f, 98.1f)
                    curveTo(141.75f, 99.72f, 141.37f, 101.15f, 140.61f, 102.4f)
                    curveTo(139.84f, 103.63f, 138.78f, 104.6f, 137.43f, 105.28f)
                    curveTo(136.08f, 105.97f, 134.51f, 106.32f, 132.73f, 106.32f)
                    close()
                    moveTo(132.7f, 102.0f)
                    curveTo(133.39f, 102.0f, 134.01f, 101.84f, 134.55f, 101.51f)
                    curveTo(135.1f, 101.19f, 135.52f, 100.74f, 135.84f, 100.18f)
                    curveTo(136.15f, 99.62f, 136.3f, 98.99f, 136.29f, 98.28f)
                    curveTo(136.3f, 97.57f, 136.15f, 96.94f, 135.84f, 96.39f)
                    curveTo(135.53f, 95.83f, 135.11f, 95.39f, 134.56f, 95.07f)
                    curveTo(134.02f, 94.74f, 133.41f, 94.58f, 132.71f, 94.58f)
                    curveTo(132.2f, 94.58f, 131.73f, 94.67f, 131.29f, 94.86f)
                    curveTo(130.85f, 95.05f, 130.47f, 95.32f, 130.14f, 95.66f)
                    curveTo(129.82f, 95.99f, 129.57f, 96.39f, 129.39f, 96.84f)
                    curveTo(129.21f, 97.29f, 129.12f, 97.77f, 129.11f, 98.3f)
                    curveTo(129.12f, 98.98f, 129.27f, 99.61f, 129.59f, 100.17f)
                    curveTo(129.9f, 100.73f, 130.32f, 101.18f, 130.86f, 101.51f)
                    curveTo(131.4f, 101.84f, 132.01f, 102.0f, 132.7f, 102.0f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF000334), 0.73f to Color(0xFF00ADD8),
                        start = Offset(146.47f,113.94f), end = Offset(162.46f,123.71f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(153.09f, 123.4f)
                    curveTo(153.28f, 123.08f, 153.72f, 123.08f, 153.91f, 123.4f)
                    lineTo(157.91f, 130.25f)
                    curveTo(158.1f, 130.58f, 157.87f, 131.0f, 157.5f, 131.0f)
                    horizontalLineTo(149.5f)
                    curveTo(149.13f, 131.0f, 148.9f, 130.58f, 149.09f, 130.25f)
                    lineTo(153.09f, 123.4f)
                    close()
                }
                path(fill = linearGradient(0.0f to Color(0xFF000334), 0.73f to Color(0xFF00ADD8),
                        start = Offset(146.47f,113.94f), end = Offset(162.46f,123.71f)), stroke =
                        null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(153.08f, 124.93f)
                    curveTo(153.27f, 125.26f, 153.73f, 125.26f, 153.92f, 124.93f)
                    lineTo(157.93f, 117.74f)
                    curveTo(158.12f, 117.41f, 157.89f, 117.0f, 157.52f, 117.0f)
                    horizontalLineTo(149.48f)
                    curveTo(149.11f, 117.0f, 148.88f, 117.41f, 149.07f, 117.74f)
                    lineTo(153.08f, 124.93f)
                    close()
                }
            }
        }
        .build()
        return _duration6Achievement!!
    }

private var _duration6Achievement: ImageVector? = null
