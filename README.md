# Quill

Minimal static site generator in Java.

## What it does

Takes a folder of Markdown files organized in directories and turns them into a static website with:

- Top navigation bar built from top-level directories
- Section index pages listing articles
- One shared layout applied to all pages
- Output in `_site/` ready to deploy

## Why

For simple personal sites where directory structure = navigation. No YAML frontmatter, no complex templating, no archives.

## Stack

- Gradle 9.5.1 + Java 21
- picocli (CLI)
- commonmark-java (Markdown)
- jte (templates)

## Usage

```
./gradlew run --args="build"
```

## License

MIT
