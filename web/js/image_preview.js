/**
 * Create an arrow function that will be called when an image is selected.
 */
const previewImage = (event) => {
    /**
     * Get the selected files.
     */
    const imageFiles = event.target.files;
    /**
     * Count the number of files selected.
     */
    const imageFilesLength = imageFiles.length;
    /**
     * If at least one image is selected, then proceed to display the preview.
     */
    if (imageFilesLength > 0) {
        /**
         * Get the image path.
         */
        const imageSrc = URL.createObjectURL(imageFiles[0]);
        /**
         * Select the image preview element.
         */
        const imagePreviewElement = document.querySelector("#preview-selected-image");
        /**
         * Assign the path to the image preview element.
         */
        imagePreviewElement.src = imageSrc;
        /**
         * Show the element by changing the display value to "block".
         */
        imagePreviewElement.style.display = "block";
    }
};


//THe Date 

var date = new Date();
var dd = date.getDate();
var mm = date.getMonth() + 1;
var yyyy = date.getFullYear();
var newDate = dd + "-" + mm + "-" + yyyy;
var p = document.getElementById("myId");
p.innerHTML = newDate;