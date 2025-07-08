# 🚀 React 80/20 Bootcamp — 10‑Day Deep‑Dive Roadmap

Master the **20%** of React/JS that powers **80%** of real‑world apps and interviews—by **building 9 mini‑apps** plus a **portfolio site**. Each day includes:

- **Concept Deep‑Dive** with direct video links
- **Hands‑On Project** to reinforce learning
- **Portfolio Integration** so your site grows alongside your skills

---

## 🎥 Core Video References

1. **Video 1** – *Learn React JS* (Beginner’s Tutorial)  
   ▶️ https://youtu.be/x4rFhThSX04  
2. **Video 2** – *React Full Course for free* (2024)  
   ▶️ https://youtu.be/CgkZ7MvWUAA  
3. **Video 3** – *React JS 19 Full Course 2025* (Master React in 2hrs)  
   ▶️ https://youtu.be/dCLhUialKPQ  
4. **Video 4** – *Learn React With This ONE Project*  
   ▶️ https://youtu.be/G6D9cBaLViA  
5. **Video 5** – *React Tutorial for Beginners*  
   ▶️ https://youtu.be/SqcY0GlETPk  
6. **Video 6** – *React JS 19 Full Course in Hindi* (2025)  
   ▶️ https://youtu.be/LuNPCSNr-nE  

---

## 📅 Day‑by‑Day Detailed Plan

### Day 1: JSX & Components  
**Concepts (Links):**  
- [JSX syntax & `createElement`](https://youtu.be/x4rFhThSX04?t=5)  
- [Function components & props](https://youtu.be/x4rFhThSX04?t=20)  
- [Props.children & Fragments](https://youtu.be/SqcY0GlETPk?t=50)  

**Build:**  
- **Mini‑App:** Card component (props: title, image, description; nested child)  
- **Repo:** `card-component`  

**Portfolio:**  
- Scaffold `portfolio-site/` (Vite React)  
- Create **Home** route & responsive **Navbar**  

---

### Day 2: Lists, Conditional Rendering & Styling  
**Concepts (Links):**  
- [Rendering arrays with `.map()` + `key`](https://youtu.be/SqcY0GlETPk?t=63)  
- [Conditional rendering (`?`, `&&`)](https://youtu.be/CgkZ7MvWUAA?t=52)  
- [Inline vs CSS module styling](https://youtu.be/CgkZ7MvWUAA?t=32)  

**Build:**  
- **Mini‑Apps:**  
  - Travel Journal list (static data → dynamic list)  
  - Color Picker (inline style binding)  
- **Repos:** `travel-journal`, `color-picker`  

**Portfolio:**  
- **Projects** page: import `projects.json`, render cards using your Card component  

---

### Day 3: State with `useState`  
**Concepts (Links):**  
- [useState basics & updater functions](https://youtu.be/CgkZ7MvWUAA?t=102)  
- [Immutable updates for arrays & objects](https://youtu.be/CgkZ7MvWUAA?t=150)  

**Build:**  
- **Mini‑Apps:**  
  - To‑Do List (add/remove tasks)  
  - Tenzies dice grid (generate & hold state)  
- **Repos:** `todo-app`, `tenzies-game`  

**Portfolio:**  
- On **Projects** page, add an “Add Project” button skeleton  

---

### Day 4: Events & Forms  
**Concepts (Links):**  
- [Event handlers: onClick & onChange](https://youtu.be/CgkZ7MvWUAA?t=89)  
- [Controlled components: text, checkbox, radio, select](https://youtu.be/LuNPCSNr-nE?t=180)  
- [Basic validation patterns](https://youtu.be/LuNPCSNr-nE?t=704)  

**Build:**  
- **Mini‑Apps:**  
  - Chef Claude ingredient form  
  - Login Form skeleton (email/password live validation)  
- **Repos:** `chef-claude`, `login-form`  

**Portfolio:**  
- Add **Contact** page  
- Embed Login Form component for consistency  

---

### Day 5: Side Effects & Timers  
**Concepts (Links):**  
- [useEffect fundamentals & cleanup](https://youtu.be/CgkZ7MvWUAA?t=204)  
- [Deep dive into useEffect](https://youtu.be/LuNPCSNr-nE?t=263)  
- [Timers: Digital clock & stopwatch](https://youtu.be/CgkZ7MvWUAA?t=224)  

**Build:**  
- **Mini‑Apps:**  
  - Digital Clock  
  - Stopwatch (with useRef for start/stop)  
- **Repos:** `digital-clock`, `stopwatch-app`  

**Portfolio:**  
- Lazy‑load Contact form component (use `React.lazy` + Suspense)  

---

### Day 6: Data Fetch & CRUD  
**Concepts (Links):**  
- [JSON Server setup & GET](https://youtu.be/LuNPCSNr-nE?t=636)  
- [POST, PUT, DELETE methods](https://youtu.be/LuNPCSNr-nE?t=663)  

**Build:**  
- **Mini‑App:** User Management UI (list, add, edit, delete)  
- **Repo:** `user-crud`  

**Portfolio:**  
- Fetch `projects.json` from JSON Server & render live project cards  

---

### Day 7: Custom Hooks & Reducers  
**Concepts (Links):**  
- [useReducer for complex state](https://youtu.be/LuNPCSNr-nE?t=759)  
- [Building a custom hook](https://youtu.be/LuNPCSNr-nE?t=511)  

**Build:**  
- **Refactor:**  
  - Chef Claude & Login forms → use `useFormFields` hook  
  - To‑Do List → manage state with `useReducer`  
- **Repos:** update existing  

**Portfolio:**  
- Implement theme toggle (light/dark) using a `useTheme` custom hook + Context  

---

### Day 8: Routing & Context API  
**Concepts (Links):**  
- [Context API for global state](https://youtu.be/LuNPCSNr-nE?t=524)  
- [React Router v6: nested, dynamic, 404](https://youtu.be/LuNPCSNr-nE?t=540)  

**Build:**  
- **Mini‑App:** Movie App  
  - Pages: Home (trending), Search, Detail (`/movie/:id`), 404  
  - Share search term via Context  
- **Repo:** `movie-app`  

**Portfolio:**  
- Multi‑page routing: Home, About, Projects, Contact, 404  
- Persist theme selection using Context  

---

### Day 9: Styling & Performance Optimization  
**Concepts (Links):**  
- [Tailwind CSS utility classes](https://youtu.be/G6D9cBaLViA?t=46)  
- [Code splitting: React.lazy + Suspense](https://youtu.be/LuNPCSNr-nE?t=772)  
- React.memo for pure components (conceptual)  

**Build:**  
- **Mini‑App:**  
  - Restyle Movie App with Tailwind (responsive grid & cards)  
  - Lazy‑load MovieDetail component  
- **Repo:** update `movie-app`  

**Portfolio:**  
- Convert portfolio layout to Tailwind  
- Lazy‑load each project card component  

---

### Day 10: Deploy & Interview Prep  
**Concepts (Links):**  
- [Deploy on Netlify/Vercel](https://youtu.be/G6D9cBaLViA?t=123)  
- Env vars (`VITE_…`) & performance audit (conceptual)  
- Review Q&A: JSX → createElement, Hook rules, Context vs Redux, performance patterns  

**Tasks:**  
- Deploy **Movie App** & **Portfolio** (custom domains)  
- Verify mobile responsiveness & accessibility (ARIA labels)  
- Finalize **Portfolio**:  
  - Live & GitHub links on project cards  
  - “About Me” & Resume download link  
  - Prepare demo scripts for interviews  

---

## ✅ By Day 10 You’ll Have

- **9 Deployed Apps** in your `react-bootcamp` GitHub org  
- A **Live Portfolio Site** showcasing all projects  
- A **Deep Understanding** of React’s critical 20% API  
- **Interview‑Ready** talking points & live demos  

Let’s code! Clone your org, kick off **Day 1**, and build! 🚀  
