import React, { useState } from 'react';
import { Link, BrowserRouter as Router } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {
  const [isOpen, setIsOpen] = useState(false);

  const toggleNavbar = () => {
    setIsOpen(!isOpen);
  };

  return (
    <Router>
      <div>
        <h1>Welcome to Shopme Admin Control Panel</h1>
        <div className="container-fluid">
          <div>
            <nav className="navbar navbar-expand-lg bg-dark navbar-dark">
              <Link className="navbar-brand" to="/">
                <img src="/images/ShopmeAdminSmall.png" alt="Shopme Admin" />
              </Link>
              <button
                className="navbar-toggler"
                type="button"
                onClick={toggleNavbar}
              >
                <span className="navbar-toggler-icon"></span>
              </button>
              <div
                className={`collapse navbar-collapse ${isOpen ? 'show' : ''}`}
                id="topNavbar"
              >
                <ul className="navbar-nav">
                  <li className="nav-item">
                    <Link className="nav-link" to="/users">Users</Link>
                  </li>
                  <li className="nav-item">
                    <Link className="nav-link" to="/categories">Categories</Link>
                  </li>
                  <li className="nav-item">
                    <Link className="nav-link" to="/brands">Brands</Link>
                  </li>
                  <li className="nav-item">
                    <Link className="nav-link" to="/products">Products</Link>
                  </li>
                  <li className="nav-item">
                    <Link className="nav-link" to="/customers">Customers</Link>
                  </li>
                  <li className="nav-item">
                    <Link className="nav-link" to="/shipping">Shipping</Link>
                  </li>
                  <li className="nav-item">
                    <Link className="nav-link" to="/orders">Orders</Link>
                  </li>
                  <li className="nav-item">
                    <Link className="nav-link" to="/report">Sales Report</Link>
                  </li>
                  <li className="nav-item">
                    <Link className="nav-link" to="/articles">Articles</Link>
                  </li>
                  <li className="nav-item">
                    <Link className="nav-link" to="/menus">Menus</Link>
                  </li>
                  <li className="nav-item">
                    <Link className="nav-link" to="/settings">Settings</Link>
                  </li>
                </ul>
              </div>
            </nav>
          </div>
          <div>
            <h1>Shopme Control Panel</h1>
          </div>
          <div>
            <p>Shopme Control Panel - Copyright &copy; Shopme</p>
          </div>
        </div>
      </div>
    </Router>
  );
}

export default App;
