# *OpenAi Whisper User Guide*

```sh
 whisper .\Recording.mp3 --model base --output_dir D:\Transcriptions
```
Here's a detailed guide on how to set up* and use **OpenAI Whisper** on your PC for speech-to-text transcription.  

---

## **Guide to Using OpenAI Whisper on Your PC**  

Whisper is an automatic speech recognition (ASR) model by OpenAI. It can transcribe and translate audio files with high accuracy. This guide will walk you through **installing**, **configuring**, and **using** Whisper on Windows, macOS, or Linux.

---

## **Step 1: Install Python**
Whisper requires **Python 3.8 or later**. Follow these steps to check and install Python:

### **Check Python Version**
Open a terminal (Command Prompt, PowerShell, or Terminal) and run:
```sh
python --version
```
or
```sh
python3 --version
```
If Python is not installed or is outdated, install it from [python.org](https://www.python.org/downloads/).

### **Ensure pip (Python Package Manager) is Installed**
Check if `pip` is installed:
```sh
pip --version
```
If not installed, run:
```sh
python -m ensurepip --default-pip
```

---

## **Step 2: Install Whisper and Dependencies**  
Whisper requires **Torch** and **ffmpeg** for transcription. Install them using the following steps:

### **Install Whisper**
Run this command:
```sh
pip install openai-whisper
```

### **Install PyTorch**
For **Windows/macOS/Linux (CPU only)**:
```sh
pip install torch torchaudio
```
For **NVIDIA GPU users (CUDA acceleration)**:
```sh
pip install torch torchvision torchaudio --index-url https://download.pytorch.org/whl/cu118
```
This enables **faster transcription** using your GPU.

### **Install FFmpeg (Required for Audio Processing)**
FFmpeg is necessary for handling different audio formats.  

- **Windows:** Download from [https://ffmpeg.org/download.html](https://ffmpeg.org/download.html) and add it to your system's PATH.
- **Mac:** Install via Homebrew:
  ```sh
  brew install ffmpeg
  ```
- **Linux:** Install via package manager:
  ```sh
  sudo apt install ffmpeg  # Debian/Ubuntu
  sudo dnf install ffmpeg  # Fedora
  ```

---

## **Step 3: Transcribe an Audio File**
Once Whisper is installed, you can transcribe audio files.

### **Basic Transcription**
Run the following command:
```sh
whisper audio.mp3 --model small
```
- Replace `audio.mp3` with your actual file name.
- The `--model` flag lets you choose a model size:  
  - `tiny` (fastest, lower accuracy)  
  - `base`  
  - `small`  
  - `medium`  
  - `large` (most accurate, slowest)

### **Example with a Larger Model**
For higher accuracy:
```sh
whisper audio.mp3 --model large
```

---

## **Step 4: Use Whisper in Python**
If you want to transcribe audio inside a Python script:

### **Basic Python Script**
```python
import whisper

model = whisper.load_model("small")  # Load the model
result = model.transcribe("audio.mp3")  # Transcribe the audio file
print(result["text"])  # Print the transcription
```

### **Using GPU for Faster Processing**
If you have an **NVIDIA GPU**, use CUDA:
```python
model = whisper.load_model("small").to("cuda")  # Use GPU acceleration
```

---

## **Step 5: Convert Audio Files to Compatible Formats**
Whisper works best with **WAV, MP3, or FLAC** formats. If your file is in another format (e.g., M4A, OGG, AAC), convert it using FFmpeg:

```sh
ffmpeg -i input.m4a -ac 1 -ar 16000 output.wav
```
- `-ac 1` → Convert to mono audio (Whisper works best with single-channel audio).  
- `-ar 16000` → Resample to **16 kHz**, improving speech recognition.

---

## **Step 6: Advanced Whisper Commands**
Whisper supports additional options for customization.

### **Transcribe Audio and Save to a File**
```sh
whisper audio.mp3 --model small --output_format txt
```
This saves the transcription as a **text file**.

### **Translate Audio to English**
If the audio is in another language, you can translate it:
```sh
whisper audio.mp3 --model medium --task translate
```

### **Detect the Language of the Audio**
To find out the spoken language in the file:
```sh
whisper audio.mp3 --model small --language auto
```

### **Transcribe Multiple Files**
If you have many files, you can run:
```sh
for file in *.mp3; do whisper "$file" --model small; done
```
(Linux/macOS users only; Windows users can use a batch script.)

---

## **Step 7: Troubleshooting**
### **Issue: "Command Not Found"**
- Ensure Python and `whisper` are installed correctly.
- Try running:
  ```sh
  python -m whisper audio.mp3 --model small
  ```

### **Issue: "CUDA Out of Memory"**
- Try using a smaller model (`base` or `tiny`).
- Reduce the batch size in Python:
  ```python
  result = model.transcribe("audio.mp3", batch_size=8)
  ```

### **Issue: Whisper is Slow**
- Use a **smaller model** for faster results.
- Enable GPU support with `to("cuda")`.
- Use **FFmpeg preprocessing** to clean the audio.

---

## **Step 8: Use Whisper in a Web App**
You can integrate Whisper into a web app using **Flask** or **Django**.

### **Simple Flask API**
Create a file `app.py`:
```python
from flask import Flask, request
import whisper

app = Flask(__name__)
model = whisper.load_model("small")

@app.route("/transcribe", methods=["POST"])
def transcribe():
    file = request.files["audio"]
    file.save("temp.wav")
    result = model.transcribe("temp.wav")
    return {"transcription": result["text"]}

if __name__ == "__main__":
    app.run(debug=True)
```
- Start the server:  
  ```sh
  python app.py
  ```
- Send audio via **Postman** or a web form.

---

## **Final Thoughts**
OpenAI Whisper is a powerful tool for speech-to-text applications. Whether you're transcribing interviews, building a voice assistant, or analyzing podcasts, Whisper provides state-of-the-art performance.  

Would you like help with **real-time transcription**, **WordPress integration**, or another feature? 😊



------

## GPU Acceleration

Yes, but with **limitations**. Whisper primarily uses **PyTorch**, which supports NVIDIA GPUs through **CUDA**. Intel Iris integrated graphics do not support CUDA, but you can still run Whisper using:

1. **CPU (Default)**
2. **Intel OpenVINO (Experimental)**
3. **DirectML (Windows-Only, Experimental)**

---

### **Option 1: Run Whisper on CPU (Default)**
By default, Whisper runs on your **CPU**, which works but is slower compared to GPU acceleration.

Run Whisper normally:
```sh
whisper audio.mp3 --model small
```

Or in Python:
```python
import whisper
model = whisper.load_model("small")  # Runs on CPU by default
result = model.transcribe("audio.mp3")
print(result["text"])
```
💡 **Tip:** If the process is slow, use a smaller model (`tiny`, `base`, or `small`).

---

### **Option 2: Use OpenVINO (Intel Acceleration)**
Intel's **OpenVINO** toolkit enables AI workloads on Intel CPUs and **iGPUs (Intel Iris, Xe, etc.)**.

#### **1. Install OpenVINO and Required Packages**
```sh
pip install openvino openvino-dev
```

#### **2. Convert Whisper to OpenVINO Model**
Download and convert a Whisper model:
```sh
git clone https://github.com/openvinotoolkit/openvino_whisper.git
cd openvino_whisper
python convert_model.py --model small
```

#### **3. Run Whisper with OpenVINO**
```python
from openvino_whisper import WhisperModel

model = WhisperModel("openvino_model/small")
result = model.transcribe("audio.mp3")
print(result["text"])
```

💡 **Pros:**  
✅ Faster than CPU-only processing.  
✅ Works on **Intel Iris / UHD Graphics / Xe Graphics**.  

💡 **Cons:**  
❌ Still slower than **NVIDIA CUDA**.  
❌ Might have **lower model compatibility**.

---

### **Option 3: Use DirectML (Windows Only)**
**DirectML** is a Windows-based API that enables AI workloads on non-NVIDIA GPUs (Intel, AMD).

#### **1. Install DirectML PyTorch**
```sh
pip install torch-directml
```

#### **2. Run Whisper on DirectML**
```python
import whisper
import torch

device = torch.device("dml")  # Use DirectML for Intel GPU
model = whisper.load_model("small").to(device)
result = model.transcribe("audio.mp3")
print(result["text"])
```
💡 **Pros:**  
✅ Works with **Intel GPUs on Windows**.  
✅ Faster than CPU-only.  

💡 **Cons:**  
❌ **Limited PyTorch support**.  
❌ **Experimental**, might crash or be unstable.

---

## **Conclusion**
| **Method**        | **Works on Intel Iris?** | **Speed Improvement?** | **Best for?** |
|------------------|----------------------|------------------|----------------|
| **CPU (Default)**  | ✅ Yes | ❌ Slow | Small files, casual use |
| **OpenVINO**  | ✅ Yes | ✅ Faster than CPU | Intel users wanting better performance |
| **DirectML**  | ✅ Yes (Windows only) | ⚠️ Experimental | Windows users with Intel GPUs |

For **best performance**, if you don’t have an **NVIDIA GPU**, try **OpenVINO** for Intel acceleration.  

Would you like help setting up OpenVINO or testing performance? 🚀