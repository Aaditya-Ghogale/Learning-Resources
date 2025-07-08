# Golang Roadmap

---

## 🎯 Roadmap Overview

| Month | Core Focus                         | Key Concepts & Tools                                                                                                                                              | Portfolio Project                                                                                       |
| :---: | ---------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
|   1   | Go Fundamentals & CLI              | • Installation & Workspace (`GOPATH`, modules)<br>• Variables, Types, Functions, Error Handling<br>• Control Flow (`if`, `for`, `switch`)                         | **Profit‑Calc CLI**: reads cost/revenue, outputs profit/loss; robust input validation & tests           |
|   2   | File I/O, Packages & Pointers      | • File operations (`os`, `io`)<br>• Organizing code into packages & modules<br>• Pointers & Memory Model                                                          | **Log‑Analyzer**: parses log files (keyword counts), writes JSON summary; package’d for reuse           |
|   3   | Structs, Methods & Interfaces      | • Defining structs, methods, embedding<br>• Interfaces & type switches<br>• Generics (Go 1.18+)                                                                   | **Todo Library & CLI**: `Task` struct, CRUD methods, generic filters, `todo-cli` wrapper                |
|   4   | Database Integration & Web APIs    | • SQL migrations (sqlc or GORM)<br>• Transactions & deadlock avoidance<br>• HTTP APIs with Gin<br>• Auth (bcrypt, JWT/PASETO)                                     | **Banking Service**: REST endpoints for transfers & users, backed by Postgres; secure auth & tests      |
|   5   | Concurrency & gRPC                 | • Goroutines, channels, `select`, worker pools<br>• Background workers with Redis queues<br>• gRPC services + HTTP gateway                                        | **Task Queue System**: gRPC + HTTP API, Redis worker, graceful shutdown, structured logging             |
|   6   | DevOps, Testing & Cloud Deployment | • Unit/integration testing (`testing`, `gomock`)<br>• Docker multistage builds & Compose<br>• CI/CD (GitHub Actions)<br>• Kubernetes (EKS, Ingress, cert‑manager) | **Todo‑API Deployment**: containerize `todo-api`, push to AWS ECR, deploy on EKS with autoscaling & TLS |

---

## 🗓️ Month‑by‑Month Breakdown

### Month 1: Go Fundamentals & CLI Tools

* **Weeks 1–2**

  * Install Go, configure VS Code/GoLand, understand modules (`go mod init`, `go mod tidy`).
  * Write basic programs: “Hello, Go!”, arithmetic, string manipulation.
  * Master control flow: `if`/`else`, `for` loops, `switch`, `break`/`continue`.
* **Weeks 3–4**

  * Handle errors idiomatically (`if err != nil`).
  * Build **Profit‑Calc CLI**:

    * Use `flag` package for arguments.
    * Read user input with `fmt.Scan`/`bufio.Reader`.
    * Write unit tests (`testing.T`).

### Month 2: File I/O, Packages & Pointers

* **Weeks 1–2**

  * Learn file operations: `os.Open`, `os.Create`, `ioutil.ReadAll`, `bufio.Scanner`.
  * Understand pointers, dereferencing, `new`, pointer receivers vs value receivers.
* **Weeks 3–4**

  * Break code into packages: e.g. `calc`, `io`, `utils`.
  * Build **Log‑Analyzer**:

    * Accept flags: `-input`, `-keywords`, `-output`.
    * Parse large log files line-by-line, count keywords in a `map[string]int`.
    * Serialize summary to JSON via `encoding/json`.
    * Publish `github.com/you/loganalyzer`, write package docs.

### Month 3: Structs, Methods & Interfaces

* **Weeks 1–2**

  * Define complex data models with structs.
  * Add methods, pointer vs value semantics, constructor patterns.
  * Explore interface types, type assertions, and switches.
* **Weeks 3–4**

  * Intro to generics: write a generic `Filter[T any]` for slices.
  * Build **Todo Library & CLI**:

    * Package `todo` with `Task` struct, in‑memory store, methods: `Add`, `List`, `Update`, `Delete`.
    * Define `Formatter` interface for output (JSON, CSV, Markdown).
    * CLI tool uses flags/subcommands to manage tasks.

### Month 4: Database Integration & Web APIs

* **Weeks 1–2**

  * Design Postgres schema; write migrations with `migrate` or `golang-migrate`.
  * Generate Go CRUD code via `sqlc` or use GORM/`sqlx`.
  * Understand transaction isolation levels; implement robust transactions.
* **Weeks 3–4**

  * Build **Banking Service** with Gin:

    * Routes: `POST /users`, `POST /login`, `POST /transfers`, `GET /balance`.
    * Secure passwords with bcrypt, issue JWT or PASETO tokens.
    * Middleware for auth & role‑based access.
    * Mock DB for HTTP handler tests (100% coverage).

### Month 5: Concurrency & gRPC

* **Weeks 1–2**

  * Practice goroutines and channels: fan‑in/fan‑out patterns, worker pools.
  * Use `context.Context` for cancellation, `defer` for cleanup.
* **Weeks 3–4**

  * Implement a **Task Queue System**:

    * gRPC service defined in Protobuf, generate Go code.
    * HTTP gateway using grpc‑gateway.
    * Redis‑backed async workers: enqueue jobs transactionally, process results.
    * Graceful shutdown, structured logging via `log.Logger` or `zap`.

### Month 6: DevOps, Testing & Cloud Deployment

* **Weeks 1–2**

  * Write table‑driven tests for packages & HTTP/gRPC handlers.
  * Cover edge cases, use `gomock` for interface mocks.
* **Weeks 3–4**

  * Dockerize each service with multistage Dockerfiles; define `docker-compose.yml` for local dev.
  * Set up GitHub Actions:

    * Steps: `checkout`, `setup-go`, `go test`, `build`, `docker build & push`.
  * Deploy to AWS:

    * Push images to ECR, create RDS & ElastiCache.
    * Provision an EKS cluster, configure Ingress + cert‑manager for TLS.
    * Connect your services via Kubernetes Services & Deployments.

---

## 📈 Tracking Progress & Next Steps

1. **GitHub Organization**

   * Create repos named after each project (e.g. `profit-calc`, `loganalyzer`, `todo-lib`, `banking-service`, `task-queue`, `deployment-guide`).
   * Write clear README.md with installation, usage, API docs, architecture diagram.

2. **Blog & Demos**

   * Publish short tutorials or video demos for each project.
   * Share on Medium or Dev.to, tag with `golang`, `cloud`, `microservices`.

3. **Community Engagement**

   * Contribute to open‑source Go projects; fix bugs or add features.
   * Participate in Go forums (Gopher Slack, Reddit r/golang).
   * Attend local meetups or virtual conferences.

By the end of these six months, you’ll have **six production‑grade projects**, deep expertise across Go’s ecosystem, and a polished portfolio—positioning you strongly for junior Go/backend roles. Good luck!
