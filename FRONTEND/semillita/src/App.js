import './App.css'
import './App2.css'
import {BrowserRouter, Routes, Route} from 'react-router-dom';
import FooterComponent from './components/FooterComponents';
import FormularioRegistroComponent from './components/FormularioRegistroComponent';
import ContactoComponent from './components/ContactoComponent';
import HeaderNavComponent from './components/HeaderNavComponent';
import NosotrosComponent from './components/NosotrosComponent';
import LoginComponent from './components/LoginComponent';

const App = () => {
  return (
    
    <BrowserRouter>
    <HeaderNavComponent/>
      <Routes>
      <Route path='/home/registro' element={<FormularioRegistroComponent/>}></Route>
      <Route path='/home/contacto' element={<ContactoComponent/>}></Route>
      <Route path='/home/nosotros' element={<NosotrosComponent/>}></Route>
      <Route path='/home/login' element={<LoginComponent/>}></Route>
      </Routes>
      <FooterComponent/>
    </BrowserRouter>
      
  );
}

export default App;
