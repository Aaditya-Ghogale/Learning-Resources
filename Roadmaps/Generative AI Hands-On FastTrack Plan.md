# 🚀 Generative AI Hands‑On FastTrack Plan

A focused, project-driven roadmap to go from zero to shipping production-grade GenAI solutions in **4 weeks**. You’ll build four full projects—each illustrating key skills: prompting, retrieval, agents, fine-tuning, and deployment.

---

## 🗂️ Phase 1 – Foundation & Prompt‑to‑API (Week 1)

### 🎯 Goal  
- Learn to craft effective prompts  
- Interact with LLMs via code (OpenAI & Hugging Face)

### 📚 What to Learn  
1. **Prompt Engineering**  
   - **Resource:** GenAI Essentials (06:12:17 – 07:00:25)  
   - **Key Topics:**  
     - Zero- vs few-shot formats  
     - Chain-of-thought prompting  
     - Temperature, max_tokens, system vs user roles  
   - **Practice:** In Playground, iterate a prompt that summarizes product reviews.

2. **Playgrounds & Workbenches**  
   - **Resource:** GenAI Essentials (07:00:25 – 07:44:09)  
   - **Key Topics:**  
     - OpenAI Playground  
     - Hugging Face Inference API console  
     - Google Gemini developer studio  
   - **Practice:** Compare outputs for the same prompt across two platforms.

3. **OpenAI API Basics**  
   - **Resource:** Generative AI Full Course DAY 2 (01:44:14 – 03:37:49)  
   - **Key Topics:**  
     - Authentication, API keys  
     - ChatCompletion vs Completion endpoints  
     - Handling JSON responses  
   - **Practice:** Write a Python script that calls `openai.ChatCompletion.create()` and prints the response.

4. **Hugging Face Transformers**  
   - **Resource:** GenAI for Developers (03:56:02 – 04:10:20)  
   - **Key Topics:**  
     - `pipeline("text-generation")` usage  
     - Loading models locally vs via API  
   - **Practice:** Use HF pipeline to generate a poem from a seed text.

### 📁 Project: `prompt-api-demo`  
A minimal CLI tool that:  
1. **Setup**  
   ```bash
   python3 -m venv venv && source venv/bin/activate
   pip install openai transformers
   ```  
2. **Features**  
   - Prompt user for input  
   - Call OpenAI ChatCompletion with function‑calling stub  
   - Call HF pipeline for text-generation  
   - Display both outputs side by side  
3. **Deliverable**  
   - `demo.py` with clear README  
   - Example `.env.example` for API keys  

---

## 🗂️ Phase 2 – Retrieval & Vectorization (Week 2)

### 🎯 Goal  
- Build embedding pipelines  
- Store & query vectors for RAG

### 📚 What to Learn  
1. **Vector DB Concepts**  
   - **Resource:** GenAI Full Course (DAY 8 – DAY 10)  
   - **Key Topics:**  
     - Embedding dimensions & vector similarity metrics  
     - Index types (HNSW, IVF)  
   - **Practice:** Visualize 2D PCA plot of sample embeddings.

2. **Pinecone Hands-On**  
   - **Resource:** Full Course (14:52:41 – 17:02:19) & GenAI Devs (08:54:45 – 09:19:39)  
   - **Key Topics:**  
     - Namespace management  
     - Upsert & query operations  
     - Cost considerations  
   - **Practice:** Index 100 news headlines, query “climate change”.

3. **ChromaDB / Weaviate**  
   - **Resource:** GenAI Devs (08:11:05 – 09:35:25)  
   - **Key Topics:**  
     - Local vs managed setup  
     - Metadata filtering  
   - **Practice:** Run a local ChromaDB instance, index PDF text.

4. **Retrieval‑Augmented Generation (RAG)**  
   - **Resource:** GenAI Essentials (20:26:04 – 22:21:19) & Devs (13:29:11 – 13:45:10)  
   - **Key Topics:**  
     - RAG architecture patterns (hybrid, closed-book + retrieval)  
     - Chain integration in LangChain / LlamaIndex  
   - **Practice:** Create a LangChain RAG chain that reads from your Pinecone index.

### 📁 Project: `rag-prototype`  
A mini service to answer questions over custom docs:  
1. **Data Preparation**  
   - Collect 3–5 articles or a PDF (e.g. research paper).  
   - Use Hugging Face tokenizer to chunk into ≤1,000-token segments.  
2. **Embedding & Indexing**  
   ```python
   from openai import OpenAI
   client = OpenAI(api_key="YOUR_KEY")
   embeddings = [client.embeddings.create(input=chunk) for chunk in chunks]
   pinecone_index.upsert(vectors=[(str(i), e.embedding) for i,e in enumerate(embeddings)])
   ```  
3. **RAG Chain**  
   ```python
   from langchain.chains import RetrievalQA
   qa = RetrievalQA.from_chain_type(llm=llm, retriever=pinecone_retriever)
   result = qa.run("What is the main conclusion?")
   ```  
4. **Web API**  
   - Flask app with `/ask?query=…`  
   - Return JSON answer + source chunk IDs  

---

## 🗂️ Phase 3 – Agents & Deployment (Week 3)

### 🎯 Goal  
- Create tool‑enabled agents  
- Deploy as microservices with CI/CD

### 📚 What to Learn  
1. **Agent Fundamentals**  
   - **Resource:** GenAI Essentials Agents (22:21:19)  
   - **Key Topics:**  
     - Tools vs actions  
     - Planning & execution loops  
   - **Practice:** Manually design an agent that schedules reminders.

2. **LangGraph Deep Dive**  
   - **Resource:** LangGraph (0:18:42 – 0:54:07) + RAG Agent (2:52:12 – 3:06:18)  
   - **Key Topics:**  
     - Type annotations for safety  
     - Testing agents with synthetic inputs  
   - **Practice:** Build “Agent 2” example and write unit tests for its tools.

3. **LangChain Agents & Memory**  
   - **Resource:** GenAI Devs (10:05:01 – 10:17:41)  
   - **Key Topics:**  
     - `ConversationalAgent` with memory buffer  
     - Tool registration & callback handlers  
   - **Practice:** Extend your RAG agent to call a weather API tool.

4. **Deployment & CI/CD**  
   - **Resource:** GenAI Devs (17:40:11) & Bootcamp Week 4–5  
   - **Key Topics:**  
     - Dockerfile best practices  
     - GitHub Actions workflow for push→build→deploy  
   - **Practice:** Containerize your Flask-based agent and deploy to Vercel or AWS Lambda.

### 📁 Project: `agent-service`  
1. **Agent Implementation**  
   - Define 2 tools (e.g., calculator, weather fetcher).  
   - Implement agent logic in LangChain.  
2. **Testing**  
   - Write pytest unit tests for each tool.  
3. **Containerization**  
   ```dockerfile
   FROM python:3.10-slim
   WORKDIR /app
   COPY requirements.txt .
   RUN pip install -r requirements.txt
   COPY . .
   CMD ["python", "agent.py"]
   ```  
4. **CI/CD**  
   - GitHub Actions `.github/workflows/deploy.yml`  
   - On push to `main`, build Docker image and deploy to your cloud target.

---

## 🗂️ Phase 4 – Customization & Fine‑Tuning (Week 4)

### 🎯 Goal  
- Fine‑tune open‑source LLMs with PEFT  
- Build and deploy an end‑to‑end chatbot

### 📚 What to Learn  
1. **LLM Customization & SFT**  
   - **Resource:** GenAI Essentials (19:51:49 – 19:56:25)  
   - **Key Topics:**  
     - Difference: SFT vs RLHF vs PEFT  
     - Data formatting for training  
   - **Practice:** Prepare a 100-example Q&A CSV for fine-tuning.

2. **PEFT (LoRA & QLoRA)**  
   - **Resource:** GenAI for Devs (13:57:35 – 14:10:07)  
   - **Key Topics:**  
     - Injecting adapters via `peft` library  
     - Quantization for resource efficiency  
   - **Practice:** Run a LoRA fine-tune on Llama 2 7B using a small GPU instance.

3. **LlamaIndex Pipelines**  
   - **Resource:** GenAI for Devs (14:28:55 – 14:57:41)  
   - **Key Topics:**  
     - Document loaders, retrievers, synthesizers  
     - Custom query transformations  
   - **Practice:** Wrap your fine-tuned model into a LlamaIndex QA pipeline.

4. **End⁠to⁠End Chatbot**  
   - **Resource:** GenAI Full Course Medical Chatbot (DAY 12 20:54:33 – 22:36:05)  
   - **Key Topics:**  
     - Conversational UI design  
     - Handling context windows & token limits  
   - **Practice:** Build Flask/Streamlit chat interface that uses your RAG + fine-tuned chain.

### 📁 Project: `genai-chatbot`  
1. **Fine⁠Tune**  
   - Script: `fine_tune.py` using `transformers` + `peft`  
   - Output: adapter weights `.pt` file  
2. **Index & Retrieval**  
   - Use same vector index from `rag-prototype` or rebuild on new docs  
3. **Chat App**  
   - `app.py` with `/chat` WebSocket or RESTful chat  
   - Frontend: minimal HTML/JS or Streamlit interface  
4. **Deployment**  
   - Dockerize and deploy with CI/CD to AWS/GCP/Vercel  
   - Add health⁠check endpoint and simple logging  

---

## 🔚 Final Wrap⁠Up

### 🚀 Portfolio Deliverables  
1. **prompt-api-demo**  
2. **rag-prototype**  
3. **agent-service**  
4. **genai-chatbot**

Each with its own GitHub repo, clear README, Docker setup, and CI pipeline.

### 🧠 Tech Stack Summary

| Layer           | Tools / Tech                                            |
| --------------- | -------------------------------------------------------- |
| LLM Providers   | OpenAI, Google Gemini Pro, Hugging Face Open/Hosted LLMs |
| Prompting       | OpenAI SDK, HF Transformers & Pipelines                 |
| Orchestration   | LangChain, LlamaIndex, LangGraph                        |
| Vector Stores   | Pinecone, ChromaDB, Weaviate                            |
| Web Framework   | Flask, Streamlit                                        |
| Fine⁠Tuning     | PEFT (LoRA, QLoRA), Hugging Face Trainer                 |
| Deployment      | Docker, GitHub Actions, AWS Lambda/API Gateway, Vercel  |

> **Next Steps:**  
> Follow this detailed plan step by step, commit daily, and by the end of Week 4 you’ll have four polished GenAI applications—and the skills to tackle any LLM project. Good luck!  
