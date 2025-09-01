# 📘 Gallery-DL Complete Guide

`gallery-dl` is a command-line program to download images/videos from various galleries (Reddit, Instagram, Pixiv, Fapello, etc.).

---

## 🔹 1. Installation

### Windows
- Download from [GitHub Releases](https://github.com/mikf/gallery-dl/releases) → get the `.exe`.
- Or install via pip:
```bash
pip install gallery-dl
```

### Linux/Mac
```bash
pip3 install gallery-dl
```

Check version:
```bash
gallery-dl --version
```

---

## 🔹 2. Basic Usage

```bash
gallery-dl URL
```

Examples:
```bash
gallery-dl "https://fapello.su/resmi-r-nair-6"
gallery-dl "https://www.reddit.com/r/wallpapers/"
```

By default, it downloads into a structured folder like:
```
./gallery-dl/<site>/<gallery>/<filename>
```

---

## 🔹 3. Handling Rate Limits & Errors

### 429 Too Many Requests
Fix → add delays:
```bash
gallery-dl --sleep 8 --sleep-request 2 "URL"
```

### Retry on Failures
```bash
gallery-dl --retries 10 --retry-wait 30 "URL"
```

This retries up to 10 times, waiting 30s each time.

---

## 🔹 4. Configuration File (Best Practice)

Instead of typing options every time, create `gallery-dl.conf`.

**Location:**
- Windows: `%APPDATA%\gallery-dl\config.json`
- Linux: `~/.config/gallery-dl/config.json`

Example `config.json`:

```json
{
  "extractor": {
    "base-directory": "D:/models",   // Change save location
    "fapello": {
      "sleep": 8,
      "retries": 10,
      "retry-wait": 30
    },
    "reddit": {
      "videos": true
    }
  },
  "downloader": {
    "part": true,              
    "retries": 10,
    "retry-wait": 30,
    "timeout": 60
  },
  "output": {
    "mode": "json"
  }
}
```

Now you can just run:
```bash
gallery-dl "URL"
```
and all settings apply automatically.

---

## 🔹 5. Common Scenarios & Fixes

### a) **Download from a text file (batch mode)**
```bash
gallery-dl -i urls.txt
```
(where `urls.txt` contains one URL per line).

### b) **Set custom download folder**
```bash
gallery-dl -d "D:/Downloads/Images" "URL"
```

### c) **Download only certain file types**
```bash
gallery-dl --filter "extension in ('jpg','png')" "URL"
```

### d) **Avoid duplicates**
Use `--download-archive`:
```bash
gallery-dl --download-archive archive.txt "URL"
```
`archive.txt` will track downloaded files, skipping duplicates next time.

### e) **Use proxy or VPN**
```bash
gallery-dl --proxy "http://127.0.0.1:8080" "URL"
```

For Tor:
```bash
gallery-dl --proxy "socks5://127.0.0.1:9050" "URL"
```

### f) **Change User-Agent**
```bash
gallery-dl --header "User-Agent: Mozilla/5.0" "URL"
```

### g) **Resume interrupted downloads**
Just re-run:
```bash
gallery-dl "URL"
```

### h) **Download single post/media**
```bash
gallery-dl "URL-to-single-image-or-video"
```

### i) **Debugging**
```bash
gallery-dl -v "URL"
```

---

## 🔹 6. Advanced Features

- **Download metadata only:**
```bash
gallery-dl --metadata "URL"
```

- **Save metadata to JSON alongside media:**
```bash
gallery-dl --write-metadata "URL"
```

- **Throttle download speed:**
```bash
gallery-dl --limit-rate 500k "URL"
```

- **Skip existing files:**
```bash
gallery-dl --skip "URL"
```

---

## 🔹 7. Automation Ideas

- Schedule with Task Scheduler (Windows) or `cron` (Linux).
- Run daily with a list of URLs (`-i urls.txt`).
- Use `--download-archive` so only new content is fetched.

---

## ✅ Quick Cheat Sheet

| Command | Use |
|---------|-----|
| `gallery-dl URL` | Basic download |
| `gallery-dl -d DIR URL` | Save to specific folder |
| `gallery-dl -i urls.txt` | Batch download from file |
| `gallery-dl --sleep 8 --retries 10` | Handle 429 errors |
| `gallery-dl --download-archive archive.txt URL` | Skip duplicates |
| `gallery-dl --proxy socks5://127.0.0.1:9050 URL` | Use proxy |
| `gallery-dl -v URL` | Debug mode |

---

⚡ With this setup, you can handle almost any issue: **rate-limits, retries, batch jobs, proxies, configs, avoiding duplicates, and resuming downloads**.
