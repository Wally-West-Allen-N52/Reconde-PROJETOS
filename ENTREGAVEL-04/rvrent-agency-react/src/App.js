import { BrowserRouter, Routes, Route } from "react-router-dom";

import Home from "./views/Home";
import Autores from "./views/autores";
import AutoresCreate from "./views/autores/Create";
import Editoras from "./views/editoras";
import EditorasCreate from "./views/editoras/Create";
import Livros from "./views/livros";
import LivrosCreate from "./views/livros/Create";
import Menu from "./components/Menu";
import Footer from "./components/Footer";

import "./style.css"

function App() {
  return (
    <BrowserRouter>
      <main>
        <Routes>
          <Route path="/" element={<RentRV />} />
          <Route />
          <Route />
          <Route />
        </Routes>
      </main>
    </BrowserRouter>
  );
}

export default App;
