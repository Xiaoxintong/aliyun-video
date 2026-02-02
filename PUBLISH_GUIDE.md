# GitHub Packages Maven 发布指南

本项目已配置好发布到 GitHub Packages 的 Maven 仓库。

## 发布配置

- **仓库地址**: https://github.com/Xiaoxintong/aliyun-video
- **Maven 仓库**: https://maven.pkg.github.com/Xiaoxintong/aliyun-video
- **Group ID**: `com.github.Xiaoxintong.aliyun-video`

## 可发布模块

| 模块 | Artifact ID | 说明 |
|------|-------------|------|
| AliyunVideoCommon | AliyunVideoCommon | 通用组件 |
| AliyunPlayerBase | AliyunPlayerBase | 播放器基础 |
| AlivcMedia | AlivcMedia | 媒体组件 |
| AlivcPlayerTools | AlivcPlayerTools | 播放器工具 |
| player_custom | player_custom | 自定义播放器 |
| AliyunSVideoBase | AliyunSVideoBase | 短视频基础 |
| snap_crop | snap_crop | 裁剪模块 |
| snap_record | snap_record | 录制模块 |

## 发布步骤

### 1. 配置 GitHub Token

在 `~/.gradle/gradle.properties` 文件中添加（或在环境变量中设置）：

```properties
gpr.user=Xiaoxintong
gpr.key=ghp_xxxxxxxxxxxxxxxxxxxx
```

> **注意**: GitHub Token 需要 `write:packages` 权限。
> 获取方式: GitHub Settings -> Developer settings -> Personal access tokens -> Tokens (classic)

### 2. 修改版本号（如需）

在各个模块的 `build.gradle` 中修改 `PUBLISH_VERSION`，或使用统一的版本变量。

### 3. 发布到 GitHub Packages

#### 发布单个模块：
```bash
./gradlew :aliyun:AliyunVideoCommon:publishReleasePublicationToGitHubPackagesRepository
```

#### 发布所有模块：
```bash
./gradlew publishAllPublicationsToGitHubPackagesRepository
```

## 使用方式

### 1. 在项目根 `build.gradle` 添加 Maven 仓库：

```gradle
repositories {
    maven {
        name = "GitHubPackages"
        url = uri("https://maven.pkg.github.com/Xiaoxintong/aliyun-video")
        credentials {
            username = "你的GitHub用户名"
            password = "你的GitHub Token (read:packages 权限)"
        }
    }
    google()
    mavenCentral()
}
```

### 2. 在 `gradle.properties` 中配置认证：

```properties
gpr.user=你的GitHub用户名
gpr.key=你的GitHub Token
```

### 3. 在模块 `build.gradle` 中添加依赖：

```gradle
dependencies {
    // 播放器基础
    api 'com.github.Xiaoxintong.aliyun-video:AliyunPlayerBase:1.2.0'

    // 播放器工具
    api 'com.github.Xiaoxintong.aliyun-video:AlivcPlayerTools:1.2.0'

    // 自定义播放器
    api 'com.github.Xiaoxintong.aliyun-video:player_custom:1.2.0'

    // 短视频基础
    api 'com.github.Xiaoxintong.aliyun-video:AliyunSVideoBase:1.2.0'

    // 录制模块
    api 'com.github.Xiaoxintong.aliyun-video:snap_record:1.2.0'

    // 裁剪模块
    api 'com.github.Xiaoxintong.aliyun-video:snap_crop:1.2.0'

    // 通用组件
    api 'com.github.Xiaoxintong.aliyun-video:AliyunVideoCommon:1.2.0'

    // 媒体组件
    api 'com.github.Xiaoxintong.aliyun-video:AlivcMedia:1.2.0'
}
```

## 版本管理

当前版本: **1.2.0**

发布新版本时，请修改：
1. 各模块 `build.gradle` 中的 `PUBLISH_VERSION`
2. 根 `build.gradle` 中 `deps` 数组的版本号

## 已发布的包

查看已发布的包：https://github.com/Xiaoxintong/aliyun-video/packages
